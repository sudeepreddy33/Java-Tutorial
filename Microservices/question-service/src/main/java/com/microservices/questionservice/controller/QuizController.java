package com.microservices.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.questionservice.model.Question;
import com.microservices.questionservice.model.QuestionWrapper;
import com.microservices.questionservice.model.Quiz;
import com.microservices.questionservice.model.SubmitQuizAnswers;
import com.microservices.questionservice.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {

	@Autowired
	QuizService quizService;

	@ResponseBody
	@PostMapping("createQuiz")
	public String createQuiz(@RequestParam String category, @RequestParam int i, @RequestParam String title) {

		quizService.getQuestionsByCategoryAndCount(category, i, title);
		return "Success";

	}

	@ResponseBody
	@PostMapping("getQuiz/{id}")
	public List<QuestionWrapper> getQuizByID(@PathVariable int id) {

		return quizService.getQuizById(id);

	}
	
	@ResponseBody
	@PostMapping("submitQuiz/{id}")
	public String submitQuizbyId(@PathVariable int id, @RequestBody List<SubmitQuizAnswers> sqas) {

		return quizService.validateQuizById(id, sqas);

	}

}
