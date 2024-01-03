package com.feedback_db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.feedback_db.entity.Feedback;

@Repository





public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
	
	
	
	
	
	
}

