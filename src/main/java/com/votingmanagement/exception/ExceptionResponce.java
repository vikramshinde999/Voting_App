package com.votingmanagement.exception;

import java.time.LocalDateTime;

public class ExceptionResponce {

	
	    private String errorMsg;
	    private String errorCode;
	    private LocalDateTime timeStamp;




	    public ExceptionResponce(String errorMsg, String errorCode, LocalDateTime timeStamp) {
	        super();
	        this.errorMsg = errorMsg;
	        this.errorCode = errorCode;
	        this.timeStamp = timeStamp;
	    }
	    
	    



	   public ExceptionResponce() {
	    
	    }





	   public String getErrorMsg() {
	        return errorMsg;
	    }



	   public void setErrorMsg(String errorMsg) {
	        this.errorMsg = errorMsg;
	    }



	   public String getErrorCode() {
	        return errorCode;
	    }



	   public void setErrorCode(String errorCode) {
	        this.errorCode = errorCode;
	    }



	   public LocalDateTime getTimeStamp() {
	        return timeStamp;
	    }



	   public void setTimeStamp(LocalDateTime timeStamp) {
	        this.timeStamp = timeStamp;
	    }



	
}
