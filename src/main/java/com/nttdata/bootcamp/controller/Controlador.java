package com.nttdata.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@GetMapping("/hola")
	public String saludo() {
		return "Hola";
	}
}
