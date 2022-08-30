package com.xoriant.delivery.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.delivery.model.Category;

public interface CategoryService {

	String addNewCategory(Category category);

	List<Category> fetchAllCategories();
	
	Optional<Category> findById(int categoryId);

}