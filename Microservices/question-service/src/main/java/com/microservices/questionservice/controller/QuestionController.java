package com.microservices.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.questionservice.model.Question;
import com.microservices.questionservice.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@ResponseBody
	@GetMapping(path = "allQuestions", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getAllQuestions() {

		return questionService.getAllQuestions();

	}

	@ResponseBody
	@GetMapping(path= "allQuestions/{category}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getAllQuestions(@PathVariable String category) {

		return questionService.getQuestionsByCategory(category);

	}
	
	@ResponseBody
	@PostMapping("addQuestion")
	public String addQuestion(@RequestBody Question question) {

		return questionService.addQuestion(question);

	}

}
