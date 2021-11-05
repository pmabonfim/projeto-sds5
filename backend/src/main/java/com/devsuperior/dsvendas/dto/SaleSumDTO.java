package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.domain.entity.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	
	private Double sum;

	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}
	
	

}
