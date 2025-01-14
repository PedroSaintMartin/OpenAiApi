package com.example.demo.controller.openAiController.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.openAi.administration.Model;
import com.example.demo.service.openAi.endpoints.ModelsService;

@RestController
@RequestMapping("/openAi/endpoints/model")
public class ModelsController {
	@Autowired
	private ModelsService modelsService;
	
	@GetMapping("/retriveModel/{model}")
	public ResponseEntity<Model> RetriveModel(@PathVariable String model) {
		return new ResponseEntity<>(modelsService.RetrieveModel(model), HttpStatus.OK);
	}
}