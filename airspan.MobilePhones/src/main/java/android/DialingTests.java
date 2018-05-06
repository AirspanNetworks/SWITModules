package android;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Timestamp;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.tools.ant.types.resources.comparators.Date;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import se.vidstige.jadb.JadbConnection;
import se.vidstige.jadb.JadbDevice;
import se.vidstige.jadb.JadbException;

public class DialingTests {

	// private RemoteWebDriver driver;
	File apkDir = new File("c:/temp");
	private JadbConnection jadb;
	private JadbDevice device;
	private AndroidDriver<?> driver;
	private String deviceId;
	boolean serverStarted;
	boolean clientStarted;
	boolean stopServer;
	boolean runningTpt;
	// updateGlobalParams
	private final Object lock = new Object();
	MobileElement tptEl;
	MobileElement clearEl;
	String tptText = "";
	String lastLine = "";
	int lastLength = 0;
	int dlCounter;
	int port = 4723;
	String ULclientCommand = String.format(
			"-c %s -u -P 1 -i 1 -p 5009 -w 100.0K -l 1400.0B -C -f k -b %s M -t 99999 -T 1", "192.168.56.207", 1);
	String ULserverCommand = String.format("-s -u -P 0 -i 1 -p 5009 -w 100.0K -B %s -l 1400.0B -C -f k",
			"10.20.56.251");

	@Test
	public void testStartIperf() throws Exception {
		// Runtime.getRuntime().exec("cmd /c iperf.exe -c 10.20.56.251 -u -P 1
		// -i 1 -p 5009 -f B -b 1K -t 100 -T 1 > dor.txt", null, new
		// File("C:/Users/dshalom/Desktop/iperf-2.0.9-win64"));
		// runClient();
		// runSever();
		// stopClient = true;
		// stopServer = true;
		jadb = new JadbConnection();
		connect();
		runTrafficUL();
		runTrafficDL();
		while (true) {
			Thread.sleep(1000);
			System.out.println("DL id :" + getDlCounter());
		}
	}

	/*
	 * public void startIperfServer() throws InterruptedException { new
	 * Thread(new Runnable() { public void run() { runSever(); } }).start(); }
	 * 
	 * public void startIperfClient() throws InterruptedException { new
	 * Thread(new Runnable() { public void run() { runClient(); } }).start(); }
	 */
	private void connect() throws IOException, JadbException {
		if (jadb.getDevices().size() == 1)
			device = jadb.getDevices().get(0);
		else if (jadb.getDevices().size() == 0) {
		}
		// report.report("Couldn't find Android Device.\n" + "Please check if
		// the device connected properly.",
		// Reporter.FAIL);
		else {
			for (JadbDevice dev : jadb.getDevices()) {
				if (dev.getSerial() == deviceId)
					device = dev;
			}
		}
		// installApps();
		String androidRelease = IOUtils.toString(device.executeShell("getprop ro.build.version.release"),
				StandardCharsets.UTF_8);
		AppiumServiceBuilder builder = new AppiumServiceBuilder().usingAnyFreePort();
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "warn");
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
		service.start();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
		// "7.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", "60");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "2fbe90e89904");
		capabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", "60");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidRelease);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.getSerial());
		capabilities.setCapability(MobileCapabilityType.APP, new File(apkDir, "app.apk").getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", "0");
		driver = new AndroidDriver<>(service, capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("cancel_button")).click();
	}

	public void runTrafficUL() throws Exception {
		System.out.println("Start listening to UL: DLserverCommand");
		// iperfMachineDL.sendCommand(DLserverCommand ,true);
		Activity iperfForAndroid = new Activity("com.magicandroidapps.iperf", "com.magicandroidapps.iperf.iperf");
		driver.startActivity(iperfForAndroid);
		MobileElement el = (MobileElement) driver.findElementById("com.magicandroidapps.iperf:id/cmdlineargs");
		el.sendKeys(ULclientCommand);
		el = (MobileElement) driver.findElementById("com.magicandroidapps.iperf:id/startstopButton");
		el.click();
		System.out.println("Start sending UL traffic: " + ULclientCommand);
		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

	public void runTrafficDL() throws Exception {
		System.out.println("Start listening to DL: " + ULserverCommand);
		Activity iperfForAndroid = new Activity("com.nextdoordeveloper.miperf.miperf",
				"com.nextdoordeveloper.miperf.miperf.MainActivity");
		driver.startActivity(iperfForAndroid);
		MobileElement el = (MobileElement) driver.findElementById("com.nextdoordeveloper.miperf.miperf:id/etCommand");
		el.sendKeys(ULserverCommand);
		el = (MobileElement) driver.findElementById("com.nextdoordeveloper.miperf.miperf:id/swStart");
		el.click();
		tptEl = (MobileElement) driver.findElementById("com.nextdoordeveloper.miperf.miperf:id/tvResult");
		clearEl = (MobileElement) driver.findElementByAccessibilityId("More options");
	}

	private void updateDlCounter() {
		long start = System.currentTimeMillis();
		try {
			synchronized (lock) {
				tptText = tptEl.getAttribute("text");
			}
			if (tptText.length() > lastLength) {
				lastLength = tptText.length();
				tptText = tptText.substring(0, tptText.lastIndexOf("\n"));
				lastLine = tptText.substring(tptText.lastIndexOf("\n") == -1 ? 0 : tptText.lastIndexOf("\n"));
				Pattern pattern = Pattern.compile("(\\d*\\.?\\d+) +Kbits\\/sec");
				Matcher matcher = pattern.matcher(lastLine);
				if (matcher.find())
					dlCounter = (int) (1000 * Float.parseFloat(matcher.group(1)));
				else
					dlCounter = 0;
				if (tptText.length() > 1000)
					clearOutput();
			} else if (lastLength == 0) {
				dlCounter = 0;
				clearOutput();
			} else
				lastLength = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("time: " + (System.currentTimeMillis() - start));
	}

	public void clearOutput() {
		new Thread(new Runnable() {
			public void run() {
				try {
					synchronized (lock) {
						clearEl.click();
						clearEl = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Clear screen']");
						clearEl.click();
					}
					clearEl = (MobileElement) driver.findElementByAccessibilityId("More options");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
/*
	 private void clearOutput() {
		long start = System.currentTimeMillis();
		synchronized (lock) {
			clearEl.click();
			clearEl = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Clear screen']");
			clearEl.click();
		}
		clearEl = (MobileElement) driver.findElementByAccessibilityId("More options");
		System.out.println("clear time: " + (System.currentTimeMillis() - start));
	 }
*/
	public double getDlCounter() {
		updateDlCounter();
		return dlCounter;
	}

	private AndroidDriver<?> startApp(String app) {
		AppiumDriverLocalService service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingAnyFreePort());
		service.start();
		AndroidDriver<?> driver;
		File apkFile = new File(apkDir, app);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(MobileCapabilityType.VERSION, "1.4.0");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
		capabilities.setCapability("newCommandTimeout", "60");
		driver = new AndroidDriver<>(service, capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	/*
	 * void answerCall() { // need to wait for call (new automa *
	 * TouchAction(driver)).press(200, 1800).moveTo(600, 0).release().perform();
	 * }
	 */

	public void stopDriver(AndroidDriver<?> driver) {
		if (driver != null) {
			driver.quit();
		}
	}
}
