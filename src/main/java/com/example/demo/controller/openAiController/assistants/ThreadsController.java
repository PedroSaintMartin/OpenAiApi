package com.example.demo.controller.openAiController.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.openAi.assistants.Thread;
import com.example.demo.service.openAi.assistants.ThreadsService;

@RestController
@RequestMapping("/openAi/assistants/thread")
public class ThreadsController {
	@Autowired
	private ThreadsService threadsService;
	
	@PostMapping("/createThread")
	public ResponseEntity<Thread> createThread() {
		return new ResponseEntity<>(threadsService.createThread(), HttpStatus.OK);
	}
	
	@GetMapping("/retrieveThread/{threadId}")
	public ResponseEntity<Thread> retrieveThread(@PathVariable String threadId) {
		return new ResponseEntity<>(threadsService.retrieveThread(threadId), HttpStatus.OK);
	}
	
	@PutMapping("/modifyThread/{threadId}")
	public ResponseEntity<Thread> modifyThread(@PathVariable String threadId) {
		return new ResponseEntity<>(threadsService.modifyThread(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteThread/{threadId}")
	public ResponseEntity<Thread> deleteThread(@PathVariable String threadId) {
		return new ResponseEntity<>(threadsService.deleteThread(threadId), HttpStatus.OK);
	}
}
