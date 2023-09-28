package com.microservices.question.repository;

import org.springframework.stereotype.Repository;

import com.microservices.question.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);
	
	@Query(value = "SELECT q.number FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :i", nativeQuery = true)
	List<Integer> findByCategoryByCount(String category, int i);
	

}