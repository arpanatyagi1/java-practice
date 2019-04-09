package com.niit.jobmanagement.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niit.jobmanagement.entities.Jobs;
import com.niit.jobmanagement.entities.MailService;
import com.niit.jobmanagement.entities.User;
import com.niit.jobmanagement.repos.JobsRepository;
import com.niit.jobmanagement.repos.UserRepository;

@Controller
@RequestMapping("/User")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	JobsRepository jobRepository;
	
	@Autowired
	User user;
	
	@RequestMapping("/showReg") 
	public String showRegisterationPage()
	{
		System.out.println(" %%%%%%%%%%%%%%%%  showing register");
		return "login/registerUser";
	}
	
	
	
	@RequestMapping("/showLogin") 
	public String showLoginPage()
	{
		System.out.println(" %%%%%%%%%%%%%%%%  showing login");
		return "login/login";
	}
	
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("user") User user)
	{
		userRepository.save(user);
		
		return"login/login";
	}
	
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@RequestMapping("/login") 
	public String login(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap modelMap,HttpSession session)
	{
		System.out.println("in login module");
		
		User user=userRepository.findByEmail(email);
		if(user==null) {
			modelMap.addAttribute("msg", "Invalid username or password.Please try again...");
			return"login/login";
		}
		else {
			
		System.out.println("user "+user);
		System.out.println("***********************************************    "+user.getPassword()+"    "+password);
		
		if(user.getPassword().equals(password))
		{
			if(user.getRole().equals("Job Seeker"))
			{
				
				session.setAttribute("username", email);
				List<Jobs> jobs=jobRepository.findAll();
				
				
				System.out.println("jobbbsss "+jobs.get(0).getCategory());
				
				 modelMap.put("jobs", jobs);
				
				return "login/userModule";
			}
			else {
				return "hrModule";
			}
			
		}
		else {
			modelMap.addAttribute("msg", "Invalid username or password.Please try again...");
		
		}
		
		return"login/login";
	}
	
	}
	
	
	
	
	
	
	
	
	@Autowired
	private MailService notificationService;
	
	
	    @RequestMapping(value="/send-Mail",method=RequestMethod.POST)
		public String send() {

			/*
			 * Creating a User with the help of User class that we have declared and setting
			 * Email address of the sender.
			 */
			user.setEmail("bhartibauhara@gmail.com");
			/*
			 * Here we will call sendEmail() for Sending mail to the sender.
			 */
			try {
				notificationService.sendEmail(user);
			} catch (MailException mailException) {
				System.out.println(mailException);
			}
			return "Congratulations! Your mail has been send to the user.";
		}
	 
		}
	 
	

