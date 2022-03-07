package com.example.demo.services;


import java.util.List;

import com.example.demo.entity.EmailSMSTemplate;
import com.example.demo.entity.EmailSmsTempResponse;
import com.example.demo.entity.EmailTemplate;

public interface EmailService {
	public EmailSmsTempResponse getEmailSmsTempResponse(String commType);

	EmailSmsTempResponse getEmailTemplate(String commType);

}
