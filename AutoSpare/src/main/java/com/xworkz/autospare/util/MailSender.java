package com.xworkz.autospare.util;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class MailSender {

	public void sendOtp(int otp, String email, String Username) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom("rajeshreddy1550985@gmail.com");
		mail.setTo(email);
		mail.setSubject("OTP");
		mail.setText("Hello" + " " + Username + "\n" + "Your OTP for password reset is:" + otp);
		mail.setReplyTo("rajeshreddy1550985@gmail.com");
        JavaMailSender send= mailSetting();
        send.send(mail);
		// javamailsender.send(mail);
	}
@Bean
	public JavaMailSender mailSetting() {
		JavaMailSenderImpl javamailsender = new JavaMailSenderImpl();
		javamailsender.setUsername("rajeshreddy1550985@gmail.com");
		javamailsender.setHost("smtp.gmail.com");
		javamailsender.setPort(587);
		javamailsender.setPassword("fnyc hnqh guid mqhn");
		Properties properties = javamailsender.getJavaMailProperties();
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		return javamailsender;

	}

}
