package com.xoriant.delivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.delivery.dao.BrandRepository;
import com.xoriant.delivery.exception.UserInputException;
import com.xoriant.delivery.model.Brand;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	private static final String NEW_BRAND_ADDED = "New Brand Added Succesfully !";

	@Override
	public String addNewBrand(Brand brand) {
		if (brand.getBrandName().isEmpty() || brand.getBrandName().isBlank()) {
			throw new UserInputException();
		}
		brandRepository.save(brand);
		return NEW_BRAND_ADDED;
	}

	@Override
	public List<Brand> fetchAllBrands() {

		return brandRepository.findAll();
	}

	@Override
	public Optional<Brand> findById(int brandId) {
		Optional<Brand> existingBrand=brandRepository.findById(brandId);
		return existingBrand;
	}

}
