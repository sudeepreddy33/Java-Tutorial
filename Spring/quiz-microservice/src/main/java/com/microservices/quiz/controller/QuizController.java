package com.microservices.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.quiz.model.QuestionWrapper;
import com.microservices.quiz.model.QuizDto;
import com.microservices.quiz.model.SubmitQuizAnswers;
import com.microservices.quiz.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService quizService;

	@ResponseBody
	@PostMapping("createQuiz")
	public String createQuiz(@RequestBody QuizDto quizDto) {

		quizService.getQuestionsByCategoryAndCount(quizDto.getCategory(), quizDto.getId(), quizDto.getTitle());
		return "Success";

	}

	@ResponseBody
	@GetMapping("getQuiz/{id}")
	public List<QuestionWrapper> getQuizByID(@PathVariable int id) {

		return quizService.getQuizById(id);

	}
	
	@ResponseBody
	@PostMapping("submitQuiz/{id}")
	public String submitQuizbyId(@PathVariable int id, @RequestBody List<SubmitQuizAnswers> sqas) {

		return quizService.validateQuizById(id, sqas);

	}

}
