package Entities;

public class RestException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int responseCode;
	private String message;
	
	public RestException(String message,int responseCode){
		this.message = message;
		this.responseCode = responseCode;
	}
	
	public int getCode(){
		return this.responseCode;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
