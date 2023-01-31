package fr.home.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.home.repository.Ingredient;
import fr.home.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientrepo;
	
	
	public List<Ingredient> getALL(){ 
		List<Ingredient> list = new ArrayList();
		ingredientrepo.findAll().forEach(e -> list.add(e));
		return list; 
	}
	
	/*
	public String unIngredient(){ 
		return ingredientrepo.UnIngredient(""); 
	}*/
	

}
