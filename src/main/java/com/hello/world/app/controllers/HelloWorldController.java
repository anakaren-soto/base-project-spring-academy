package com.hello.world.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class HelloWorldController {
	
	@GetMapping({"/holaMundo",""})
	public ResponseEntity<?> hello(){
		Map<String,String> respuesta = new HashMap<String, String>();
		respuesta.put("helloworld", "ingrese un nombre desde la url base/{nombre}");
		return new ResponseEntity<Map<String,String>>(respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<?> hello(@PathVariable(value = "name") String name,Model model){
		
		model.addAttribute("helloworld", name);
		return new ResponseEntity<Model>(model, HttpStatus.OK);
	}
}
