package com.example.RMgX_Assest_Management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RMgX_Assest_Management.model.Category;
import com.example.RMgX_Assest_Management.repository.CategoryRepository;

@Service
public class CategoryService {
	
	 @Autowired
	    CategoryRepository categoryRepository;

	    public Category getCategoryById(int id) {
	        return categoryRepository.findById(id).get();
	    }

	    public void saveOrUpdate(Category category) {
	        categoryRepository.save(category);
	    }

}
