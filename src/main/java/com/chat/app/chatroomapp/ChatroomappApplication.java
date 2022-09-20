package com.chat.app.chatroomapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ChatroomappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ChatroomappApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ChatroomappApplication.class);
	}

}
