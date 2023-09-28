package com.microservices.question.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class QuestionWrapper implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5194891459665051893L;
	private int number;
	private String question_text;
	private String option_A;
	private String option_B;
	private String option_C;
	private String option_D;
	@Override
	public String toString() {
		return "QuestionWrapper [number=" + number + ", question_text=" + question_text + ", option_A=" + option_A
				+ ", option_B=" + option_B + ", option_C=" + option_C + ", option_D=" + option_D + "]";
	}
	
	

}
