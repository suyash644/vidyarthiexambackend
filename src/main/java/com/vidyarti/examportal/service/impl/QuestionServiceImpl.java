package com.vidyarti.examportal.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyarti.examportal.model.exam.Question;
import com.vidyarti.examportal.model.exam.Quiz;
import com.vidyarti.examportal.repo.QuestionRepository;
import com.vidyarti.examportal.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepo;

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepo.save(question);
	}

	@Override
	public Set<Question> getQuestiones() {
		// TODO Auto-generated method stub
		return new HashSet<>(questionRepo.findAll());
	}

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return questionRepo.findById(questionId).get();
	}

	@Override
	public Set<Question> getQuestionOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return questionRepo.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(Long questionId) {
		// TODO Auto-generated method stub
		questionRepo.deleteById(questionId);
		
	}

}
