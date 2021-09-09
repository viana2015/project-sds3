package com.jrcg.dsvendas.dtos;

import com.jrcg.dsvendas.entities.Seller;

public class SaleSuccessDto {

	private String sellerName;
	private Long sumVisited;
	private Long deals;
	
	public SaleSuccessDto() {
		
	}

	public SaleSuccessDto(Seller seller, Long sumVisited, Long deals) {
		super();
		this.sellerName = seller.getName();
		this.sumVisited = sumVisited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getSumVisited() {
		return sumVisited;
	}

	public void setSumVisited(Long sumVisited) {
		this.sumVisited = sumVisited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

		
}
