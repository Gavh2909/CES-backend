package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.utils.EmailUtils;

@RestController
public class SendEmail {
	@Autowired
	private EmailUtils emailUtils;
	
	@PostMapping("/sendEmail")
	public String sendEmail() {
		boolean isSent = emailUtils.sendEmail("satishgavhane2909@gmail.com", "Hi Satish", "Crack");
		
      if(isSent) {
    	  return "Mail sent";
      }else {
    	  return "failed";
      }
	}
}
