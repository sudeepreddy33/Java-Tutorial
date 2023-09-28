package com.microservices.questionservice.model;

import lombok.Data;

@Data
public class QuestionWrapper {
	
	private int number;
	private String option_A;
	private String option_B;
	private String option_C;
	private String option_D;
	private String question_text;
	

}
