package com.devsuperior.dsvendas.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.domain.entity.Seller;
import com.devsuperior.dsvendas.domain.repository.SellerRepository;
import com.devsuperior.dsvendas.dto.SellerDTO;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> lista = repository.findAll();
		
		return lista.stream()
					.map(s -> new SellerDTO(s))
					.collect(Collectors.toList());
	}

}
