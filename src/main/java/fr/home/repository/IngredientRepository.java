package fr.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.home.entity.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

	
	@Query( nativeQuery = true , value = "select idingredient , nom from ingredient")
	List<Object> ListeIngredient ();
	
}
