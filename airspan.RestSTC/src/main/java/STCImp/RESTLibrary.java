package STCImp;
import okhttp3.*;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import Entities.RestException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by iagmon on 09-Nov-16.
 */
public class RESTLibrary {

    String IP;

    public RESTLibrary(String ip) {
        this();
        this.IP = ip;
    }

    private OkHttpClient _OKhttpClient;
    private final String moduleSignature = "[Rest Lib]";
    private final long CONNECT_TIME_OUT = new Long(1000);
    private final long READ_TIME_OUT = new Long(1000);
    private final long WRITE_TIME_OUT = new Long(1000);

    public RESTLibrary() {
        _OKhttpClient = new OkHttpClient.Builder().connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS).readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(WRITE_TIME_OUT, TimeUnit.SECONDS).build();

    }
    
    public void setIP(String ip){
    	this.IP = ip;
    }

    public List<String> Get(String resource, ExpectedHttpCode expectedResponseCode, NameValuePair[] valuePairHeaders) throws IOException {

        Request.Builder builder = new Request.Builder();

        if (valuePairHeaders!=null) {
            for (NameValuePair header : valuePairHeaders) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }
        Request req = builder.url(String.format("http://%s/%s",IP, resource))
                .get()
                .url(String.format("http://%s/%s",IP, resource))
                .build();

        return execute(req, expectedResponseCode.value());
    }

    public List<String> Post(String resource, ExpectedHttpCode expectedResponseCode, NameValuePair[] valuePairHeaders , NameValuePair[] valuePairBody) throws IOException {

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody reqBody = null;
        if (valuePairBody != null) {
            String body = "";
            for (NameValuePair pair : valuePairBody) {
                body += pair.getName() + "=" + pair.getValue() + "&";
            }

            reqBody = RequestBody.create(mediaType, body);
        }
        Request.Builder builder = new Request.Builder();
        if (valuePairHeaders!= null && valuePairHeaders.length>0) {
            for (NameValuePair header : valuePairHeaders) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }

        builder.url(String.format("http://%s/%s",IP, resource));
        if (valuePairBody !=null)
            builder.post(reqBody);
        Request req = builder.build();

        return execute(req, expectedResponseCode.value());
    }

    public List<String> PostFile(String resource, ExpectedHttpCode expectedResponseCode, byte[] data, BasicNameValuePair ... headers) throws IOException {

        MediaType mediaType = MediaType.parse("application/octet-stream");


        RequestBody requestBody = RequestBody.create(mediaType, data);

        Request.Builder builder = new Request.Builder();
        if (headers!=null && headers.length>0) {
            for (NameValuePair header : headers) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }
        Request req = builder.url(String.format("http://%s/%s",IP, resource))
                .post(requestBody)
                .build();

        return execute(req, expectedResponseCode.value());
    }

    public void Delete(String resource, ExpectedHttpCode expectedResponseCode, BasicNameValuePair ... headers) throws IOException {
    	delete(resource, expectedResponseCode.value(),headers);
    }

    public void delete(String resouece, int expectedResponseCode,BasicNameValuePair... headers) throws IOException{
    	Request.Builder builder = new Request.Builder();
    	RequestBody reqBody = null;
    	
    	if (headers!=null && headers.length>0) {
            for (NameValuePair header : headers) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }
    	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");

    	String body ="";
    	
        reqBody = RequestBody.create(mediaType, body);
        
        
        Request req = builder.url(String.format("http://%s/%s",IP, resouece))
                .delete(reqBody)
                .build();

        execute(req, expectedResponseCode);
    }
    
    public void Put(String resource, ExpectedHttpCode expectedResponseCode, NameValuePair[] valuePairBody,BasicNameValuePair... headers) throws RuntimeException, IOException {
        Request.Builder builder = new Request.Builder();
        RequestBody reqBody = null;
        if (headers!=null && headers.length>0) {
            for (NameValuePair header : headers) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");

        if (valuePairBody != null) {
            String body = "";
            for (NameValuePair pair : valuePairBody) {
                body += pair.getName() + "=" + pair.getValue() + "&";
            }

            reqBody = RequestBody.create(mediaType, body);
        }
        
        Request req = builder.url(String.format("http://%s/%s",IP, resource))
                .put(reqBody)
                .build();

        execute(req, expectedResponseCode.value());
    }
    

    public void Put(String resource, ExpectedHttpCode expectedResponseCode, BasicNameValuePair ... headers) throws RuntimeException, IOException {
        Request.Builder builder = new Request.Builder();
        if (headers!=null && headers.length>0) {
            for (NameValuePair header : headers) {
                builder.addHeader(header.getName(), header.getValue());
            }
        }
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");

        String body = "";

        RequestBody reqBody = RequestBody.create(mediaType, body);


        Request req = builder.url(String.format("http://%s/%s",IP, resource))
                .put(reqBody)
                .build();

        execute(req, expectedResponseCode.value());
    }

    private void checkResponse(Response response, int expectedResponseCode) {
        if (response != null && !response.isSuccessful())
            if (response.networkResponse().code() != expectedResponseCode){
            	String message = printBody(response);
            	response.close();
            	throw new RestException(message, response.networkResponse().code());
            }
    }
    
    private String printBody(Response response){
    	String result ="";
    	try{
    		result = response.body().string();
    		System.out.println(moduleSignature+": incorrect method - body response : "+result);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return result;
    }

    private List<String> execute(Request request, int expectedResponseCode) throws IOException {

    	Response response = _OKhttpClient.newCall(request).execute();

        checkResponse(response, expectedResponseCode);
        if (response.body() == null)
            return null;
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.body().byteStream()));
        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while ((line = rd.readLine()) != null) {
            lines.add(line);
        }
        response.close();
        
        return lines;
    }
}
