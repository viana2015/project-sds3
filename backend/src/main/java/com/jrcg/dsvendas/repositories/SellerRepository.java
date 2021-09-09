package com.jrcg.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrcg.dsvendas.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
