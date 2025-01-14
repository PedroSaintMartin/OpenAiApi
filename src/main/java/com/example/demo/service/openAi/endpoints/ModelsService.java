package com.example.demo.service.openAi.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.openAi.administration.Error;
import com.example.demo.dto.openAi.administration.Model;
import com.example.demo.exception.customException.OpenAiException;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ModelsService {
	@Value("${openai.api.key}")
	private String KEY;
	
	@Autowired
	private OkHttpClient CLIENT;
	
	@Autowired
	private Gson GSON;
	
	public Model RetrieveModel(String model) {
		try {
			Request request = new Request.Builder()
	                .url("https://api.openai.com/v1/models/" + model)
	                .addHeader("Content-Type", "application/json")
	                .addHeader("Authorization", "Bearer " + KEY)
	                .get()
	                .build();
			
			Response response = CLIENT.newCall(request).execute();
			
			switch (response.code()) {
				case 404 -> throw new OpenAiException(GSON.fromJson(response.body().string(), Error.class), HttpStatus.NOT_FOUND);
			}
			
			return GSON.fromJson(response.body().string(), Model.class);
		} catch (OpenAiException e) {
			throw e;
		} catch (Exception e) {			
			throw new OpenAiException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
