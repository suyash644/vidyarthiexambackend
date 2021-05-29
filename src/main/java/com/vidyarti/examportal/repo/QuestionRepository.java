package com.vidyarti.examportal.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyarti.examportal.model.exam.Question;
import com.vidyarti.examportal.model.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	Set<Question> findByQuiz(Quiz quiz);

}
