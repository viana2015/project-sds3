package com.jrcg.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrcg.dsvendas.dtos.SellerDto;
import com.jrcg.dsvendas.entities.Seller;
import com.jrcg.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDto> findAll() {
		List<Seller>obj = repository.findAll();
		if (obj.isEmpty()) {
			return null;
		}
		
		return obj.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
	}
	
}
