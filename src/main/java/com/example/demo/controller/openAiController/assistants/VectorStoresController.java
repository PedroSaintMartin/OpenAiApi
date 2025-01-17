package com.example.demo.controller.openAiController.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.openAi.assistants.VectorStore;
import com.example.demo.dto.openAi.assistants.request.CreateVectorStore;
import com.example.demo.dto.openAi.assistants.response.DeleteVectorStore;
import com.example.demo.service.openAi.assistants.VectoresStoresService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/openAi/assistants/vectorStores")
public class VectorStoresController {
	@Autowired
	private VectoresStoresService vectoresStoresService;
	
	@PostMapping("/createVectorStore")
	public ResponseEntity<VectorStore> createVectorStore(@Valid @RequestBody(required = false) CreateVectorStore data) {
		return new ResponseEntity<>(vectoresStoresService.createVectorStore(data), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteVectorStore/{idVectorStore}")
	public ResponseEntity<DeleteVectorStore> deleteVectorStore(@PathVariable String idVectorStore) {
		return new ResponseEntity<>(vectoresStoresService.deleteVectorStore(idVectorStore), HttpStatus.OK);
	}
}
