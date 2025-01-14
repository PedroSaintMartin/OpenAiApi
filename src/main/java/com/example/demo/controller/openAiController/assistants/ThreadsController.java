package com.example.demo.controller.openAiController.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.openAi.assistants.Thread;
import com.example.demo.service.openAi.assistants.ThreadsService;

@RestController
@RequestMapping("/openAi/assistants/thread")
public class ThreadsController {
	@Autowired
	private ThreadsService threadsService;
	
	@DeleteMapping("/deleteThread/{threadId}")
	public ResponseEntity<Thread> deleteThread(@PathVariable String threadId) {
		return new ResponseEntity<>(threadsService.deleteThread(threadId), HttpStatus.OK);
	}
}
