package com.example.demo.service.openAi.assistants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.openAi.administration.Error;
import com.example.demo.dto.openAi.assistants.VectorStore;
import com.example.demo.dto.openAi.assistants.request.CreateVectorStore;
import com.example.demo.dto.openAi.assistants.response.DeleteVectorStore;
import com.example.demo.exception.customException.OpenAiException;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Service
public class VectoresStoresService {
	@Value("${openai.api.key}")
	private String KEY;
	
	@Autowired
	private OkHttpClient CLIENT;
	
	@Autowired
	private Gson GSON;
	
	public VectorStore createVectorStore(CreateVectorStore data) {
		try {
			Request request = new Request.Builder()
	                .url("https://api.openai.com/v1/vector_stores")
	                .addHeader("Content-Type", "application/json")
	                .addHeader("OpenAI-Beta", "assistants=v2")
	                .addHeader("Authorization", "Bearer " + KEY)
	                .post(RequestBody.create(GSON.toJson(data).getBytes()))
	                .build();
			
			Response response = CLIENT.newCall(request).execute();
			
			switch (response.code()) {
				case 400 -> 
					throw new OpenAiException(GSON.fromJson(response.body().string(), Error.class), HttpStatus.BAD_REQUEST);
				default ->
					{ return GSON.fromJson(response.body().string(), VectorStore.class); }
			}
		} catch (OpenAiException e) {
			throw e;
		} catch (Exception e) {
			throw new OpenAiException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public DeleteVectorStore deleteVectorStore(String idVectorStore) {
		try {
			Request request = new Request.Builder()
	                .url("https://api.openai.com/v1/vector_stores/" + idVectorStore)
	                .addHeader("Content-Type", "application/json")
	                .addHeader("OpenAI-Beta", "assistants=v2")
	                .addHeader("Authorization", "Bearer " + KEY)
	                .delete()
	                .build();
			
			Response response = CLIENT.newCall(request).execute();
			
			switch (response.code()) {
				case 400 -> 
					throw new OpenAiException(GSON.fromJson(response.body().string(), Error.class), HttpStatus.BAD_REQUEST);
				case 404 ->
					throw new OpenAiException(GSON.fromJson(response.body().string(), Error.class), HttpStatus.NOT_FOUND);
				default ->
					{ return GSON.fromJson(response.body().string(), DeleteVectorStore.class); }
			}
		} catch (OpenAiException e) {
			throw e;
		} catch (Exception e) {
			throw new OpenAiException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
