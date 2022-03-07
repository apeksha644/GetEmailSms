package com.example.demo.entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;


@Entity
@Table
@SqlResultSetMapping(name = "SmsTemp", classes = @ConstructorResult(targetClass = SMSTemplate.class,
                   columns = {@ColumnResult(name = "ID", type = Integer.class),
                		   @ColumnResult(name = "SenderName", type = String.class),
                		   @ColumnResult(name = "MessageBody", type = String.class),
                		   @ColumnResult(name = "DlTTemplateId", type = String.class)}))

public class SMSTemplate {
	
	@Id
	private int ID;
	private String SenderName;
	private String MessageBody;
	private String D1TTemplateID;
	public SMSTemplate(int iD, String senderName, String messageBody, String d1tTemplateID) {
		super();
		ID = iD;
		SenderName = senderName;
		MessageBody = messageBody;
		D1TTemplateID = d1tTemplateID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getMessageBody() {
		return MessageBody;
	}
	public void setMessageBody(String messageBody) {
		MessageBody = messageBody;
	}
	public String getD1TTemplateID() {
		return D1TTemplateID;
	}
	public void setD1TTemplateID(String d1tTemplateID) {
		D1TTemplateID = d1tTemplateID;
	}
	
	

}
