package com.microservices.quiz.repository;

import org.springframework.stereotype.Repository;

import com.microservices.quiz.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
