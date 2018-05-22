package STCImp;

public enum ExpectedHttpCode {
	OK(200),
	Created(201),
	Confirmed(202),
	No_Content(204),
	Bad_Request(400),
	Unauthorized(401),
	Forbidden(403),
	Not_Found(404),
	Method_Not_Allowed(405),
	Conflict(409),
	Internal_Server_Error(500);
	
	int codeId;

	 ExpectedHttpCode(int codeId) {
		this.codeId = codeId;
	}
	 
	 public int value() {
		 return codeId;
	 }
	 
	 public static ExpectedHttpCode fromValue(int number) {
		 for(ExpectedHttpCode code : values()) {
			 if(number == code.value()) {
				 return code;
			 }
		 }
		 return null;
	 }
	
}
