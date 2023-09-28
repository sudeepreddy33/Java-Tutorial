package com.microservices.questionservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.questionservice.model.Question;
import com.microservices.questionservice.model.QuestionWrapper;
import com.microservices.questionservice.model.Quiz;
import com.microservices.questionservice.model.SubmitQuizAnswers;
import com.microservices.questionservice.repository.QuestionRepository;
import com.microservices.questionservice.repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository quizRepository;

	@Autowired
	QuestionRepository questionRepository;

	public String getQuestionsByCategoryAndCount(String category, int i, String title) {

		List<Question> questions = questionRepository.findByCategoryByCount(category, i);

		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizRepository.save(quiz);

		return "Success";

	}

	public List<QuestionWrapper> getQuizById(int id) {

		Optional<Quiz> quiz = quizRepository.findById(id);

		List<Question> questions = quiz.get().getQuestions();

		List<QuestionWrapper> questionsForUser = new ArrayList<QuestionWrapper>();

		for (Question q : questions) {
			QuestionWrapper qw = new QuestionWrapper();
			qw.setNumber(q.getNumber());
			qw.setQuestion_text(q.getQuestion_text());
			qw.setOption_A(q.getOption_A());
			qw.setOption_B(q.getOption_B());
			qw.setOption_C(q.getOption_C());
			qw.setOption_D(q.getOption_D());
			questionsForUser.add(qw);
		}

		return questionsForUser;

	}

	public String validateQuizById(int id, List<SubmitQuizAnswers> sqas) {

		int score = 0;

		for (SubmitQuizAnswers sqa : sqas) {
			Optional<Question> rightAnswer = questionRepository.findById(sqa.getNumber());
			if (rightAnswer.get().getCorrect_answer().equals(sqa.getCorrect_answer())) {
				score++;
			}

		}

		return "Your Score is " + score;
	}

}
