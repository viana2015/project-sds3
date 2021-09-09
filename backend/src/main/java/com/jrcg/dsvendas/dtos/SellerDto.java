package com.jrcg.dsvendas.dtos;

import java.io.Serializable;

import com.jrcg.dsvendas.entities.Seller;

public class SellerDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;

	public SellerDto() {
		
	}

	public SellerDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDto(Seller obj) {
		this.id = obj.getId();
		this.name = obj.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
	
}
