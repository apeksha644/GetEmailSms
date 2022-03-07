package com.example.demo.entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;



@Entity
@Table
@SqlResultSetMapping(name = "EmailTemp", classes = @ConstructorResult(targetClass = EmailTemplate.class,
columns = {@ColumnResult(name = "ID", type = Integer.class),@ColumnResult(name = "SenderEmailID", type = String.class),
		   @ColumnResult(name = "SenderName", type = String.class),@ColumnResult(name = "Subject", type = String.class),
		   @ColumnResult(name = "MessageBody", type = String.class),@ColumnResult(name = "CC", type = String.class),
		   @ColumnResult(name = "BCC", type = String.class)}))

public class EmailTemplate {
	
	@Id
	private int ID;
	private String SenderEmailID;
	private String SenderName;
	private String Subject;
	private String MessageBody;
	private String CC;
	private String BCC;
	
	
	
	public EmailTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmailTemplate(int iD, String senderEmailID, String senderName, String subject, String messageBody, String cC,
			String bCC) {
		super();
		ID = iD;
		SenderEmailID = senderEmailID;
		SenderName = senderName;
		Subject = subject;
		MessageBody = messageBody;
		CC = cC;
		BCC = bCC;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getSenderEmailID() {
		return SenderEmailID;
	}



	public void setSenderEmailID(String senderEmailID) {
		SenderEmailID = senderEmailID;
	}



	public String getSenderName() {
		return SenderName;
	}



	public void setSenderName(String senderName) {
		SenderName = senderName;
	}



	public String getSubject() {
		return Subject;
	}



	public void setSubject(String subject) {
		Subject = subject;
	}



	public String getMessageBody() {
		return MessageBody;
	}



	public void setMessageBody(String messageBody) {
		MessageBody = messageBody;
	}



	public String getCC() {
		return CC;
	}



	public void setCC(String cC) {
		CC = cC;
	}



	public String getBCC() {
		return BCC;
	}



	public void setBCC(String bCC) {
		BCC = bCC;
	}
	
	
	
	

}
