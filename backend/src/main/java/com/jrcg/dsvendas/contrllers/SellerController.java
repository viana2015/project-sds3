package com.jrcg.dsvendas.contrllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrcg.dsvendas.dtos.SellerDto;
import com.jrcg.dsvendas.services.SellerService;

@RestController
@RequestMapping("/sallers")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDto>> findAll(){
		//List<SallerDto>listDto = service.findAll();
		return ResponseEntity.ok(service.findAll());
	}
}
