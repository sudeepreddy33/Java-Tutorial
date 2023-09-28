package com.microservices.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.quiz.feign.FeignConfig;
import com.microservices.quiz.model.Question;
import com.microservices.quiz.model.QuestionWrapper;
import com.microservices.quiz.model.Quiz;
import com.microservices.quiz.model.SubmitQuizAnswers;
import com.microservices.quiz.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository quizRepository;

	@Autowired
	FeignConfig feignConfig;

	public String getQuestionsByCategoryAndCount(String category, int i, String title) {

		List<Integer> questionIds = feignConfig.getAllQuestionsByCategory(category, i);

		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questionIds);
		quizRepository.save(quiz);

		return "Success";

	}

	public List<QuestionWrapper> getQuizById(int id) {

		Quiz quiz = quizRepository.findById(id).get();

		List<QuestionWrapper> questionsForUser = feignConfig.getQuestionsbyId(quiz.getQuestionIds());

		return questionsForUser;

	}

	public String validateQuizById(int id, List<SubmitQuizAnswers> sqas) {

		String score = feignConfig.submitQuizbyId(sqas);

		return "Your Score is " + score;
	}

}
