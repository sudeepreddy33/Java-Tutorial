package com.microservices.quiz.model;

import lombok.Data;

@Data
public class SubmitQuizAnswers {
	
	private int number;
	private String correct_answer;

}
