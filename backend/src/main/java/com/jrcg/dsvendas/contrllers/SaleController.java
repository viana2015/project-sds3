package com.jrcg.dsvendas.contrllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrcg.dsvendas.dtos.SaleDto;
import com.jrcg.dsvendas.dtos.SaleSuccessDto;
import com.jrcg.dsvendas.dtos.SaleSumDto;
import com.jrcg.dsvendas.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		return ResponseEntity.ok(service.findAll(pageable));
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>>amountGroupBySeller(){
		return ResponseEntity.ok(service.amountGroupBySeller());
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>>successGroupBySeller(){
		return ResponseEntity.ok(service.successGroupBySeller());
	}
}
