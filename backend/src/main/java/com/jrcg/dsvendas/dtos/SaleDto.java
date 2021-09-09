package com.jrcg.dsvendas.dtos;

import java.time.LocalDate;

import com.jrcg.dsvendas.entities.Sale;

public class SaleDto {

	private Long id;

	private Integer visited;

	private Integer deals;

	private Double amount;

	private LocalDate date;
	
	private SellerDto seller;

	public SaleDto() {
	
	}

	public SaleDto(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDto seller) {
	
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDto(Sale obj) {
		super();
		this.id = obj.getId();
		this.visited = obj.getVisited();
		this.deals = obj.getDeals();
		this.amount = obj.getAmount();
		this.date = obj.getDate();
		this.seller = new SellerDto(obj.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDto getSeller() {
		return seller;
	}

	public void setSeller(SellerDto seller) {
		this.seller = seller;
	}
	
}
