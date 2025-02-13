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

import com.example.demo.dto.openAi.assistants.Message;
import com.example.demo.dto.openAi.assistants.request.CreateMessage;
import com.example.demo.dto.openAi.assistants.response.DeleteMessage;
import com.example.demo.service.openAi.assistants.MessagesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/openAi/assistants/message")
public class MessagesController {
	@Autowired
	private MessagesService messagesService;
	
	@PostMapping("/createMessage")
	public ResponseEntity<Message> createMessage(@Valid @RequestBody CreateMessage data) {
		return new ResponseEntity<>(messagesService.createMessage(data), HttpStatus.OK);
	}

	@DeleteMapping("/deleteMessage/{idThread}/{idMessage}")
	public ResponseEntity<DeleteMessage> deleteMessage(@PathVariable String idThread, @PathVariable String idMessage) {
		return new ResponseEntity<>(messagesService.deleteMessage(idThread, idMessage), HttpStatus.OK);
	}
}
