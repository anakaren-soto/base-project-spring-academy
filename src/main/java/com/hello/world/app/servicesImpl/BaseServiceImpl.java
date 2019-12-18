package com.hello.world.app.servicesImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hello.world.app.services.BaseService;
@Service
public class BaseServiceImpl implements BaseService{
	private final static Logger LOG= Logger.getLogger("com.puntosingular.base.servicesImpl.BaseServiceImpl");
	
	@Override
	public ResponseEntity<?> getHolaMundo() {
		 Map<String, Object> respuesta=new HashMap<>();
		   LOG.info("Hola Mundo desde Spring Boot- getHolaMundo");
		   respuesta.put("respuesta", "Hola Mundo Desde Spring Boot- getHolaMundo  - 202Accepted");
		   return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}

}
