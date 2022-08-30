package com.xoriant.delivery.service;

import java.util.List;

import com.xoriant.delivery.model.Brand;

public interface BrandService {

	String addNewBrand(Brand brand);
	
	List<Brand> fetchAllBrands();
}
