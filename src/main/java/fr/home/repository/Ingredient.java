package fr.home.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ingredient")
public class Ingredient {
	
	@Id
	@GeneratedValue
	@Column(name = "idingredient")
	private Integer idingredient;
	
	@Column(name = "nom")
	private String nomingredient;

}
