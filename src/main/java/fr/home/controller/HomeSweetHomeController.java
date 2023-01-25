package fr.home.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor; 

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/Bienvenue")
public class HomeSweetHomeController {
	
	@Operation(summary = "Bienvenue Loubna")
	@GetMapping(path="/all")
	public @ResponseBody String Bienvenue(){
		return "Bonjour à vous";
	}

	@GetMapping("/c3p0")
	@Operation(summary = " Test Appel Inter API, cad une API qui appelle une autre")
	public ResponseEntity<String> Jesuisla() throws Exception {
		
		return ResponseEntity.ok("Blaablaa");
		
	}
	
}
