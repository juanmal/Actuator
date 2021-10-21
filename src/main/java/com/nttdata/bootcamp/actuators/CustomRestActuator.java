package com.nttdata.bootcamp.actuators;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomRestActuator {
	
	@GetMapping("/random")
	public ResponseEntity<String> customEndpoint() {
		return new ResponseEntity<>("Prueba rest controller", HttpStatus.OK);
	}
}
