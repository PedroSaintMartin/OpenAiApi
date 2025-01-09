package com.example.demo.service.openAi.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.dto.openAi.administration.Model;
import com.example.demo.exception.customException.OpenAiDefaultException;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;

@Service
public class ModelsService {
	@Value("${openai.api.key}")
	private String KEY;
	
	@Autowired
	private OkHttpClient CLIENT;
	
	@Autowired
	private Gson GSON;
	
	/*public Request ListModels() {
		Request request = new Request.Builder()
                .url("https://api.openai.com/v1/models")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer " + KEY)
                .delete()
                .build();
		
		GSON.fromJson(CLIENT.newCall(request).execute(), List<Models>);
		
		return ;
	}*/
	
	public Model RetrieveModel(String model) {
		try {
			Request request = new Request.Builder()
	                .url("https://api.openai.com/v1/models/" + model)
	                .addHeader("Content-Type", "application/json")
	                .addHeader("Authorization", "Bearer " + KEY)
	                .delete()
	                .build();
			
			System.out.println(CLIENT.newCall(request).execute().body().string());
			
			return new Model();
		} catch (Exception e) {
			throw new OpenAiDefaultException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
