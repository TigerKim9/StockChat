package com.chat.chatting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.chatting.entity.Chat;
import com.chat.chatting.entity.ChatRoom;
import com.chat.chatting.entity.DTO.ChatDTO;
import com.chat.chatting.entity.DTO.ChatRoomDTO;
import com.chat.chatting.service.ChatService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ChatAPIController {
	
	@Autowired
	ChatService chatService;

	@PostMapping("/saveChat")
	public int saveChat(@RequestBody Chat chat) {
		log.info("Chat 정보 : {}", chat);
		int result = chatService.saveChat(chat);

		return result;
	}
	
	@PostMapping
	public int createChatRoom(@RequestBody ChatRoom chatRoom) {
		int result = chatService.createChatRoom(chatRoom);
		return result;
	}
	
	@PostMapping("/chatView")
	public List<ChatDTO> chatView(long chatRoomId) {
		List<ChatDTO> lists = chatService.chatView(chatRoomId);
		return lists;
	}
	
	@PostMapping("/searchChatRoomList")
	public List<ChatRoomDTO> searchChatRoomList(@RequestBody String keyword){
		List<ChatRoomDTO> lists = chatService.chatRoomView(keyword);
		
		return lists;
	}
}