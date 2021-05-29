package com.vidyarti.examportal.service;

import java.util.Set;

import com.vidyarti.examportal.model.exam.Question;
import com.vidyarti.examportal.model.exam.Quiz;

public interface QuestionService {
	
public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestiones();
	
	public Question getQuestion(Long questionId);
	
	public Set<Question> getQuestionOfQuiz(Quiz quiz);
	
	public void deleteQuestion(Long questionId);

}
