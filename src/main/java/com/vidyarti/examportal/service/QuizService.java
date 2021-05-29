package com.vidyarti.examportal.service;

import java.util.Set;

import com.vidyarti.examportal.model.exam.Quiz;

public interface QuizService {
	
public Quiz adduiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set<Quiz> getQuizess();
	
	public Quiz getQuiz(Long quizId);
	
	public void deleteQuiz(Long quizId);

}
