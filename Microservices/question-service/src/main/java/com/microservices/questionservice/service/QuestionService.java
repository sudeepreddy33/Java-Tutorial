package com.microservices.questionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.questionservice.model.Question;
import com.microservices.questionservice.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository repository;

	public List<Question> getAllQuestions() {
		return repository.findAll();

	}

	public List<Question> getQuestionsByCategory(String category) {
		return repository.findByCategory(category);

	}

	public String addQuestion(Question question) {
		repository.save(question);
		return "Question is added successfully";

	}

}
