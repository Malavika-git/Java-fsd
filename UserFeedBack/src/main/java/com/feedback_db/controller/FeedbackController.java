package com.feedback_db.controller;

import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.feedback_db.entity.Feedback;
import com.feedback_db.repository.FeedbackRepository;
import com.feedback_db.service.FeedbackService;

import jakarta.servlet.http.HttpSession;

@Controller
public class FeedbackController {
	@Autowired
private FeedbackService service;
  private FeedbackRepository feedbackRepository;

  @Autowired
  public FeedbackController(FeedbackRepository feedbackRepository) {
    this.feedbackRepository = feedbackRepository;
  }
  
  @GetMapping("/")	
  public String homePage(@ModelAttribute("feed1")Feedback feed1) {	
  	return "index";
  }	


  @PostMapping("feedback")	
  public String Feedback(@ModelAttribute("feed1")Feedback feed1,HttpSession ses) {	
		 
		
      String savefeedback = service.savefeedback(feed1);	
     ses.setAttribute("Msg", savefeedback);	
  return "FeedbackResponse";	

  }


}