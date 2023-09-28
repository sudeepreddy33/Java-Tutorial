package com.microservices.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.question.model.Question;
import com.microservices.question.model.QuestionWrapper;
import com.microservices.question.model.SubmitQuizAnswers;
import com.microservices.question.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@ResponseBody
	@PostMapping(path = "getQuestions", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<QuestionWrapper> getQuestionsbyId(@RequestBody List<Integer> number) {

		return questionService.getQuestionsByIds(number);

	}

	@ResponseBody
	@GetMapping(path= "generate", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getAllQuestionsByCategory(@RequestParam String category, @RequestParam Integer number) {

		return questionService.getQuestionsByCategoryAndCount(category, number);

	}
	
	@ResponseBody
	@PostMapping("addQuestion")
	public String addQuestion(@RequestBody Question question) {

		return questionService.addQuestion(question);

	}
	
	@ResponseBody
	@PostMapping("calculateScore")
	public String submitQuizbyId(@RequestBody List<SubmitQuizAnswers> sqas) {

		return questionService.validateQuizById(sqas);

	}
	
	
	

}
