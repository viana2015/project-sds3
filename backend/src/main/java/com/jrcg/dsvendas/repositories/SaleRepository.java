package com.jrcg.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jrcg.dsvendas.dtos.SaleSuccessDto;
import com.jrcg.dsvendas.dtos.SaleSumDto;
import com.jrcg.dsvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.jrcg.dsvendas.dtos.SaleSumDto(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDto> amountGroupBySeller();
	
	@Query("SELECT new com.jrcg.dsvendas.dtos.SaleSuccessDto(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDto> successGroupBySeller();

}
