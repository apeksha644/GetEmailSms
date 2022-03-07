package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.EmailSMSTemplate;
import com.example.demo.entity.EmailTemplate;
import com.example.demo.entity.SMSTemplate;

@Repository
public class EmailDao {
	
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public EmailSMSTemplate getEmailSmsTemplate(String commType){
		boolean flag = false;
		String typeOfObject = "EmailTemp";
		if(commType.equals("S")) {
			flag = true;
			typeOfObject = "SmsTemp";
		}
		StoredProcedureQuery query = em.createStoredProcedureQuery("GetEmailSmsTemplate", typeOfObject)
				.registerStoredProcedureParameter("CommunicationType", String.class, ParameterMode.IN)
				.setParameter("CommunicationType", commType);
		query.execute();
		List<SMSTemplate> smsTemp = null;
		List<EmailTemplate> emailTemp = null;
		if(flag) {
			smsTemp = query.getResultList();
		}else {
			emailTemp = query.getResultList();
		}
		EmailSMSTemplate template = new EmailSMSTemplate();
		template.setEmailTemplate(emailTemp);
		template.setSmsTemplate(smsTemp);
		return template;
	}

	
	
	
	@SuppressWarnings("unchecked")
	public EmailSMSTemplate getEmailTemplate(String commType){
		boolean flag = false;
		String typeOfObject = "EmailTemp";
		if(commType.equals("S")) {
			flag = true;
			typeOfObject = "SmsTemp";
		}
		StoredProcedureQuery query = em.createStoredProcedureQuery("GetEmailSmsTemplate", typeOfObject)
				.registerStoredProcedureParameter("CommunicationType", String.class, ParameterMode.IN)
				.setParameter("CommunicationType", commType);
		query.execute();
		List<SMSTemplate> smsTemp = null;
		List<EmailTemplate> emailTemp = null;
		if(flag) {
			smsTemp = query.getResultList();
		}else {
			emailTemp = query.getResultList();
		}
		EmailSMSTemplate template = new EmailSMSTemplate();
		template.setEmailTemplate(emailTemp);
		template.setSmsTemplate(smsTemp);
		return template;
	}
	
	

}
