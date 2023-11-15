package com.futshop.futshop.exception;


import java.util.Date;

public class MessageExceptionHandler {
    private Date timestamp;
    private Integer status;
    private String error;
    private String message;
	
    public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public MessageExceptionHandler(Date timestamp, Integer status, String error, String message) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
	}
    
    
    
}
