package com.nttdata.bootcamp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@GetMapping("/hola")
	public String hola() {
		return "Hola!";
	}
	
	@GetMapping("/hola/{nombre}")
	public String holaNombre(@PathVariable(value="nombre") String nombre) {
		return "Hola " + nombre;
	}
}
