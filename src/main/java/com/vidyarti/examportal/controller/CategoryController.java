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

import com.vidyarti.examportal.model.exam.Category;
import com.vidyarti.examportal.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	//add category
	@PostMapping("/")
	public ResponseEntity<?> addCategory(@RequestBody Category category){
		Category savedCategory = categoryService.addCategory(category);
		return ResponseEntity.ok(savedCategory);
	}
	
	//get category by id
	@GetMapping("/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") Long categoryId) {
		return categoryService.getCategory(categoryId);
	}
	
	//get all categories
	@GetMapping("/")
	public ResponseEntity<?> getCategories(){
		return ResponseEntity.ok(categoryService.getCategories());
	}
	
	@PutMapping("/")
	public Category updateCategry(@RequestBody Category category) {
		return categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable Long categoryId) {
		categoryService.deleteCategory(categoryId);
	}
}
