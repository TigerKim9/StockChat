package com.chat.chatting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.chat.chatting.service.ChatService;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class ChatController {
	
	@Autowired
	ChatService chatService;

	@GetMapping("/chat")
	public String chatGET() {

		log.info("@ChatController, chat GET()");

		return "chat";
	}
	
}