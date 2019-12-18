package com.hello.world.app.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.world.app.services.BaseService;

@RestController
@RequestMapping("/base")
public class HelloWorldController {
	
	private final static Logger LOG= Logger.getLogger("com.puntosingular.base.controllers.BaseController");
	//services
	@Autowired
	BaseService baseService;
	
	@GetMapping("/holaMundo")
	public ResponseEntity<?> holaMundo() {
	   Map<String, Object> respuesta=new HashMap<>();
	   
	  
	   //LOG.info("Hola Mundo desde Spring Boot");
	   respuesta.put("respuesta", "Hola Mundo Desde Spring Boot - 202Accepted");
	   return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	   
	}   
	@GetMapping("/getHolaMundo")
	public ResponseEntity<?> getHolaMundo() {
	  return baseService.getHolaMundo();
	   
	}   
}
