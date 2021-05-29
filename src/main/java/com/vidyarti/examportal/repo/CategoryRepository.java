package com.vidyarti.examportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidyarti.examportal.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
