package com.example.demo.controller.openAiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.openAi.administration.Model;
import com.example.demo.service.openAi.endpoints.ModelsService;

@RestController
@RequestMapping("/openAi/endPoints")
public class EndPointsController {
	@Autowired
	private ModelsService modelsService;
	
	@GetMapping("/retriveModel")
	public ResponseEntity<Model> RetriveModel() {
		return new ResponseEntity<>(modelsService.RetrieveModel("gpt-4o-mini"), HttpStatus.OK);
	}
}
