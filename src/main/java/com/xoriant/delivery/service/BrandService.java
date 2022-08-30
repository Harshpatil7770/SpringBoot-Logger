package com.xoriant.delivery.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.delivery.model.Brand;

public interface BrandService {

	String addNewBrand(Brand brand);

	List<Brand> fetchAllBrands();

	Optional<Brand> findById(int brandId);
}
