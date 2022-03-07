package com.example.demo.services;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmailDao;
import com.example.demo.entity.EmailSMSTemplate;
import com.example.demo.entity.EmailSmsTempResponse;
import com.example.demo.entity.EmailTemplate;

@Service
public class EmailServiceImpl implements EmailService {

	
	@Autowired
	private EmailDao emailDao;
	
	@Autowired
	private EntityManager em;
	
	@Override
	public EmailSmsTempResponse getEmailSmsTempResponse(String commType) {
		// TODO Auto-generated method stub
		EmailSMSTemplate list = emailDao.getEmailSmsTemplate(commType);
		EmailSmsTempResponse response = new EmailSmsTempResponse(1, 0, "I", "Success", list);
		return response;
	}
	
	@Override
	public EmailSmsTempResponse getEmailTemplate(String commType) {
		// TODO Auto-generated method stub
		EmailSMSTemplate list = emailDao.getEmailSmsTemplate(commType);
		EmailSmsTempResponse response = new EmailSmsTempResponse(1, 0, "I", "Success", list);
		return response;
	}

	

}
