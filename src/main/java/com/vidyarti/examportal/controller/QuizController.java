package com.vidyarti.examportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidyarti.examportal.model.exam.Quiz;
import com.vidyarti.examportal.service.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@PostMapping("/")
	public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz){
		return ResponseEntity.ok(quizService.adduiz(quiz));
	}
	
	@PutMapping("/")
	public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz){
		return ResponseEntity.ok(quizService.updateQuiz(quiz));
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getQuizess(){
		return ResponseEntity.ok(quizService.getQuizess());
	}
	
	//get single quiz
	@GetMapping("/{quizId}")
	public ResponseEntity<Quiz> getQuizById(@PathVariable("quizId") Long quizId){
		return ResponseEntity.ok(quizService.getQuiz(quizId));
	}
	
	@DeleteMapping("/{quizId}")
	public void deleteQuizById(@PathVariable("quizId") Long quizId) {
		System.out.print(quizId);
		quizService.deleteQuiz(quizId);
	}

}
