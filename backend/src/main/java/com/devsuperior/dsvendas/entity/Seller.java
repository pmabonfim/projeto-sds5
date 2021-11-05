package com.devsuperior.dsvendas.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "seller")
	private java.util.List<Sale> sales = new ArrayList<>();

	public Seller() {
		super();
	}

	public Seller(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
