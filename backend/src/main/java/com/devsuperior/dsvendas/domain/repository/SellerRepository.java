package com.devsuperior.dsvendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.domain.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
