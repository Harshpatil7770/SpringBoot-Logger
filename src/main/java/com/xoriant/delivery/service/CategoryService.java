package com.xoriant.delivery.service;

import java.util.List;

import com.xoriant.delivery.model.Category;

public interface CategoryService {

	String addNewCategory(Category category);

	List<Category> fetchAllCategories();

}