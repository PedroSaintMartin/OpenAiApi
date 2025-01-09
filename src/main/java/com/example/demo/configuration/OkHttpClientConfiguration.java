package com.example.demo.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import okhttp3.OkHttpClient;

@Configuration
public class OkHttpClientConfiguration {
	@Bean
    OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)  // Tempo limite de conexão
                .readTimeout(30, TimeUnit.SECONDS)     // Tempo limite de leitura
                .writeTimeout(30, TimeUnit.SECONDS)    // Tempo limite de gravação
                .build();
    }
}
