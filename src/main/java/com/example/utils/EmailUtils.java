package com.example.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailUtils {
	@Autowired
	private JavaMailSender javaMainSender;

	public boolean sendEmail(String to, String subject, String body) {
		boolean isSent = false;
		try {

			MimeMessage mimeMsg = javaMainSender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);
			helper.setTo(to);
			helper.setSubject(subject);

			helper.setText(body);

			javaMainSender.send(mimeMsg);

			isSent = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSent;
	}
}