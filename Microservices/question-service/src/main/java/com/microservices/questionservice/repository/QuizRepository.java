package com.microservices.questionservice.repository;

import org.springframework.stereotype.Repository;

import com.microservices.questionservice.model.Question;
import com.microservices.questionservice.model.Quiz;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {





}
