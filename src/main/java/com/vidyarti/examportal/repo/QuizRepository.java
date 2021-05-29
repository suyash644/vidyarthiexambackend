package com.vidyarti.examportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyarti.examportal.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
