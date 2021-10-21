package com.nttdata.bootcamp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class Controlador {
	
	private Counter counter;
	
	public Controlador(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping("/hola")
	public String hola() {
		counter.increment();
		return "Hola!";
	}
	
	@GetMapping("/hola/{nombre}")
	public String holaNombre(@PathVariable(value="nombre") String nombre) {
		counter.increment();
		return "Hola " + nombre;
	}
}
