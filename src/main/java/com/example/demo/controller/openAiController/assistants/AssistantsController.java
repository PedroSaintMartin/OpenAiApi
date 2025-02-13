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

import com.example.demo.dto.openAi.assistants.Assistant;
import com.example.demo.dto.openAi.assistants.request.CreateAssistant;
import com.example.demo.dto.openAi.assistants.response.DeleteAssitant;
import com.example.demo.service.openAi.assistants.AssistantsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/openAi/assistants/assistant")
public class AssistantsController {
	@Autowired
	private AssistantsService assistantsService;
	
	@PostMapping("/createAssistant")
	public ResponseEntity<Assistant> createAssistant(@Valid @RequestBody CreateAssistant data) {
		return new ResponseEntity<>(assistantsService.createAssistant(data), HttpStatus.OK);
	}

	@DeleteMapping("/deleteAssistant/{idAssistant}")
	public ResponseEntity<DeleteAssitant> deleteAssistant(@PathVariable String idAssistant) {
		return new ResponseEntity<>(assistantsService.deleteAssistant(idAssistant), HttpStatus.OK);
	}
}
