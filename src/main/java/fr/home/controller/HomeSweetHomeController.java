package fr.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.home.entity.Ingredient;
import fr.home.repository.IngredientRepository;
import fr.home.service.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor; 

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/Bienvenue")
public class HomeSweetHomeController {
	
	@Autowired
	IngredientRepository r;
	
	@Operation(summary = "Bienvenue Loubna")
	@GetMapping(path="/all")
	public @ResponseBody String Bienvenue(){
		return "Bonjour à vous";
	}

	@GetMapping("/Ingredient")
	@Operation(summary = "Je suis dans les ingrédients")
	public Iterable<Ingredient> getAllIn() {
		return r.findAll();
	}
	
	
	@GetMapping("/Ing")
	@Operation(summary = "Je suis dans les ingr")
	public Iterable<Object> getAllInL() {
		return r.ListeIngredient();
	}
	
	
}
