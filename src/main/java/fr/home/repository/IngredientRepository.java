package fr.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

	/*
	@Query("select nom from ingredient where idingredient = 1")
	List<Ingredient> ListeIngredient (String nom);
	*/
	
	//@Query("select nom from ingredient where idingredient = 1")
	
	
	
}
