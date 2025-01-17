package com.example.demo.service.openAi.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.openAi.assistants.Assistant;
import com.example.demo.dto.openAi.assistants.request.CreateAssistant;
import com.example.demo.exception.customException.OpenAiException;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class AssistantsService {
	@Value("${openai.api.key}")
	private String KEY;
	
	@Autowired
	private OkHttpClient CLIENT;
	
	@Autowired
	private Gson GSON;
	
	public Assistant createAssistant(CreateAssistant data) {
		try {
			Request request = new Request.Builder()
		                .url("https://api.openai.com/v1/assistants")
		                .addHeader("Content-Type", "application/json")
		                .addHeader("OpenAI-Beta:", "assistants=v2")
		                .addHeader("Authorization", "Bearer " + KEY)
		                .post(RequestBody.create(GSON.toJson(data).getBytes()))
		                .build();
				
			Response response = CLIENT.newCall(request).execute();
			
			System.out.println(GSON.toJson(data));
			System.out.println(response.body().string());
			System.out.println(response.code());
			
			
			/*
			switch (response.code()) {
				case 400 -> 
					throw new OpenAiException("'threadId' invalid: " + threadId, HttpStatus.BAD_REQUEST);
			}*/
				
	
			return GSON.fromJson(response.body().string(), Assistant.class);
		} catch (Exception e) {
			throw new OpenAiException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
