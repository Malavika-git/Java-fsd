package com.feedback_db.service;

import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Service;

import com.feedback_db.entity.Feedback;
import com.feedback_db.repository.FeedbackRepository;		
		

		
		
@Service		
public class FeedbackService {		
	@Autowired	
	private FeedbackRepository repo;	
		
		
	  public String savefeedback(Feedback feed) { 	
		  Feedback save1 = repo.save(feed);
		  return " Your feedback successfully added to the Database.."; 
		  
	  }	
}
	 	
