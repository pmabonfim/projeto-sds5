package com.devsuperior.dsvendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.domain.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
