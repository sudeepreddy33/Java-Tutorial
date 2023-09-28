package com.microservices.quiz.model;

import lombok.Data;

@Data
public class QuizDto {
	
	private String category;
	private int id;
	private String title;

}
