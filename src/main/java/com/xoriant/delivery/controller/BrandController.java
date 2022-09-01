package com.xoriant.delivery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.delivery.model.Brand;
import com.xoriant.delivery.service.BrandService;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
	
	/*
	*Brand controller rest api methods.
	*/

	@Autowired
	private BrandService brandService;

	@PostMapping("/save")
	public ResponseEntity<String> addNewBrand(@RequestBody Brand brand) {
		String response = brandService.addNewBrand(brand);
		return new ResponseEntity<String>(response, HttpStatus.CREATED);
	}

	@GetMapping("/findAll")
	public List<Brand> fetchAllBrands() {
		return brandService.fetchAllBrands();
	}

	@GetMapping("/find")
	public Optional<Brand> findById(@RequestParam int brandId) {
		return brandService.findById(brandId);
	}
}
