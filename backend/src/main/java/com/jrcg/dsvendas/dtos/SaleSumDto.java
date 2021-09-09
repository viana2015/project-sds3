package com.jrcg.dsvendas.dtos;

import java.io.Serializable;

import com.jrcg.dsvendas.entities.Seller;

public class SaleSumDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Double sum;
	
	public SaleSumDto() {
	
	}

	public SaleSumDto(Seller seller, Double sum) {
		
		this.SellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
