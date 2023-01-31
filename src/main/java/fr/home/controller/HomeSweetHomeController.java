package fr.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.home.repository.Ingredient;
import fr.home.service.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor; 

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/Bienvenue")
public class HomeSweetHomeController {
	
	@Autowired
	IngredientService i;
	
	@Operation(summary = "Bienvenue Loubna")
	@GetMapping(path="/all")
	public @ResponseBody String Bienvenue(){
		return "Bonjour à vous";
	}

	@GetMapping("/Ingredient")
	@Operation(summary = "Je suis dans les ingrédients")
	public ResponseEntity<List<Ingredient>> getAllIn() {
		List<Ingredient> list = i.getALL();
		return new ResponseEntity<List<Ingredient>>(list, HttpStatus.OK);
	}
	
}
