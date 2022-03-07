package com.example.demo.entity;

public class EmailSmsTempResponse {
	
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private EmailSMSTemplate Template;
	public EmailSmsTempResponse(int status, int errorCode, String messageType, String message,
			EmailSMSTemplate template) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		Template = template;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public EmailSMSTemplate getTemplate() {
		return Template;
	}
	public void setTemplate(EmailSMSTemplate template) {
		Template = template;
	}
	@Override
	public String toString() {
		return "EmailSmsTempResponse [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType
				+ ", Message=" + Message + ", Template=" + Template + "]";
	}
	
	
	

}
