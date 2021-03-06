package com.jrcg.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrcg.dsvendas.dtos.SaleDto;
import com.jrcg.dsvendas.dtos.SaleSuccessDto;
import com.jrcg.dsvendas.dtos.SaleSumDto;
import com.jrcg.dsvendas.entities.Sale;
import com.jrcg.dsvendas.repositories.SaleRepository;
import com.jrcg.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> obj = repository.findAll(pageable);
		if (obj.isEmpty()) {
			return null;
		}
		return obj.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupBySeller() {
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDto> successGroupBySeller() {
		return repository.successGroupBySeller();
	}
}
