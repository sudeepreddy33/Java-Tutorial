package com.microservices.question.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.question.model.Question;
import com.microservices.question.model.QuestionWrapper;
import com.microservices.question.model.SubmitQuizAnswers;
import com.microservices.question.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository repository;

	public List<QuestionWrapper> getQuestionsByIds(List<Integer> numbers) {

		List<QuestionWrapper> wrapper = new ArrayList<QuestionWrapper>();

		for (Integer i : numbers) {

			Question question = repository.findById(i).get();
			QuestionWrapper qw = new QuestionWrapper();
			qw.setNumber(question.getNumber());
			qw.setQuestion_text(question.getQuestion_text());
			qw.setOption_A(question.getOption_A());
			qw.setOption_B(question.getOption_B());
			qw.setOption_C(question.getOption_C());
			qw.setOption_D(question.getOption_D());
			wrapper.add(qw);
		}

		return wrapper;

	}

	public List<Question> getQuestionsByCategory(String category) {
		return repository.findByCategory(category);

	}

	public String addQuestion(Question question) {
		repository.save(question);
		return "Question is added successfully";

	}

	public List<Integer> getQuestionsByCategoryAndCount(String category, int i) {

		List<Integer> questionIds = repository.findByCategoryByCount(category, i);

		return questionIds;

	}

	public String validateQuizById(List<SubmitQuizAnswers> sqas) {

		int score = 0;

		for (SubmitQuizAnswers sqa : sqas) {
			Optional<Question> rightAnswer = repository.findById(sqa.getNumber());
			if (rightAnswer.get().getCorrect_answer().equals(sqa.getCorrect_answer())) {
				score++;
			}

		}

		return "Your Score is " + score;
	}

}
