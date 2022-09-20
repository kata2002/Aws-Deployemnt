package com.chat.app.chatroomapp.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.chatroomapp.model.Message;


@RestController
public class MessageController {

	@MessageMapping("/message")
	@SendTo("/topic/return-to") //This url is for permanent subscribe like youtube so we get all noti from it in constant way.
	public Message getContent(@RequestBody Message message) { // Its like an post mapping but replace with MesMap we can also save all the things in database like we do.
		try {
			
			Thread.sleep(2000); //Hold for 2 sec
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return message;
		
	}
	@GetMapping("/")
	public String welcome() {
		return "welcome to chatroom";
	}
	
}
