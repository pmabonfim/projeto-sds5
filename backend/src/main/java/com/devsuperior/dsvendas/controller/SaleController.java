package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.domain.service.SaleService;
import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;

@RestController
@RequestMapping("/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable page) {
		Page<SaleDTO> lista = service.findAll(page);
		
		return !lista.isEmpty() ? ResponseEntity.ok(lista) : ResponseEntity.notFound().build(); 
	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
		List<SaleSumDTO> lista = service.amountGroupBySeller();
		
		return !lista.isEmpty() ? ResponseEntity.ok(lista) : ResponseEntity.notFound().build(); 
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
		List<SaleSuccessDTO> lista = service.successGroupBySeller();
		
		return !lista.isEmpty() ? ResponseEntity.ok(lista) : ResponseEntity.notFound().build(); 
	}
	
}

