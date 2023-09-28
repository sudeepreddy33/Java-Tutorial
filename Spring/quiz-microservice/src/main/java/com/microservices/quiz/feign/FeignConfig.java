package com.microservices.quiz.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microservices.quiz.model.QuestionWrapper;
import com.microservices.quiz.model.SubmitQuizAnswers;

@FeignClient("QUESTION-MICROSERVICE")
public interface FeignConfig {

	@ResponseBody
	@PostMapping(path = "question/getQuestions", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuestionWrapper> getQuestionsbyId(@RequestBody List<Integer> number);

	@ResponseBody
	@GetMapping(path = "question/generate", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getAllQuestionsByCategory(@RequestParam String category, @RequestParam Integer number);

	@ResponseBody
	@PostMapping("question/calculateScore")
	public String submitQuizbyId(@RequestBody List<SubmitQuizAnswers> sqas);

}
