package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.EmailSMSBody;
import com.example.demo.entity.EmailSmsTempResponse;
import com.example.demo.entity.EmailTemplate;
import com.example.demo.services.EmailService;



@RestController
public class EmailController {
	
	
	
	
	@Autowired
	private EmailService emailService;
	
	
	@PostMapping(path = "/GetEmailSmsTemplate",
			consumes = {MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public EmailSmsTempResponse getEmailSmsTemplate( @RequestBody EmailSMSBody Comm ,@RequestHeader Map<String, String> headers) {
		System.out.println(headers.get("token"));
		System.out.println(headers.get("url"));
		System.out.println(headers.toString());
	    System.out.println(Comm.toString());
		
		return this.emailService.getEmailSmsTempResponse(Comm.getCommunicationType());
//		EmailSmsTempResponse resp = this.emailService.getEmailSmsTempResponse(Comm.getCommunicationType());
//		System.out.println(resp.toString());
//		return resp;
	}
	
	@PostMapping(path="/GetEmail")
	public EmailSmsTempResponse getEmailTemplate(@RequestBody EmailSMSBody Comm ,@RequestHeader  String token)
	{
		
		
		String uri = "http://localhost:9110//GetEmailSmsTemplate";
		
		RestTemplate restTemplate = new RestTemplate();
		
		//System.out.println(uri);
//		RestTemplate restTemplate = new RestTemplate();
//		System.out.println(Comm.toString());
//		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("token", token);
//		headers.add("url", uri);
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("communicationType",Comm.getCommunicationType());
//		
//		HttpEntity<Map<String , Object>> httpentity = new HttpEntity<>(map,headers);
//		System.out.println(httpentity.toString());
//		
		return restTemplate.getForObject(uri, EmailSmsTempResponse.class);
   }
	
	
	
	
	
	
}
