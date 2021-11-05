package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.domain.service.SellerService;
import com.devsuperior.dsvendas.dto.SellerDTO;

@RestController
@RequestMapping("/sellers")
public class SellerController {
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> lista = service.findAll();
		
		return !lista.isEmpty() ? ResponseEntity.ok(lista) : ResponseEntity.notFound().build(); 
	}
}
