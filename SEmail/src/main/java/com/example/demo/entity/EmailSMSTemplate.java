package com.example.demo.entity;

import java.util.List;

public class EmailSMSTemplate {
	
	
	private List<EmailTemplate> emailTemplate;
	private List<SMSTemplate> smsTemplate;
	
	
	public EmailSMSTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmailSMSTemplate(List<EmailTemplate> emailTemplate, List<SMSTemplate> smsTemplate) {
		super();
		this.emailTemplate = emailTemplate;
		this.smsTemplate = smsTemplate;
	}


	public List<EmailTemplate> getEmailTemplate() {
		return emailTemplate;
	}


	public void setEmailTemplate(List<EmailTemplate> emailTemplate) {
		this.emailTemplate = emailTemplate;
	}


	public List<SMSTemplate> getSmsTemplate() {
		return smsTemplate;
	}


	public void setSmsTemplate(List<SMSTemplate> smsTemplate) {
		this.smsTemplate = smsTemplate;
	}
	
	
	
	
	

}
