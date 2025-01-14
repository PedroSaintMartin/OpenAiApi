package com.example.demo.service.openAi.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.openAi.assistants.Thread;
import com.example.demo.exception.customException.OpenAiException;
import com.google.gson.Gson;

import jakarta.persistence.criteria.CriteriaBuilder.Case;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ThreadsService {
	@Value("${openai.api.key}")
	private String KEY;
	
	@Autowired
	private OkHttpClient CLIENT;
	
	@Autowired
	private Gson GSON;
	
	public Thread deleteThread(String threadId) {
		try {
			Request request = new Request.Builder()
	                .url("https://api.openai.com/v1/threads/" + threadId)
	                .addHeader("Content-Type", "application/json")
	                .addHeader("Authorization", "Bearer " + KEY)
	                .get()
	                .build();
			
			Response response = CLIENT.newCall(request).execute();
			
			switch (response.code()) {
				case 200 -> 
					{ return GSON.fromJson(response.body().string(), Thread.class); }
				case 400 -> 
					throw new OpenAiException("'threadId' invalid: " + threadId, HttpStatus.BAD_REQUEST);
				default ->
					throw new IllegalArgumentException("Unexpected value: " + response.code());
			}
		} catch (Exception e) {
			throw new OpenAiException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
