package com.chat.chatting.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chat.chatting.entity.Chat;
import com.chat.chatting.entity.ChatRoom;
import com.chat.chatting.entity.DTO.ChatDTO;
import com.chat.chatting.entity.DTO.ChatRoomDTO;
import com.chat.chatting.mapper.ChatMapper;

@Service
public class ChatService {
	
	ChatMapper chatMapper;
	Logger logger = LoggerFactory.getLogger(ChatService.class);
	
	public int createChatRoom(ChatRoom chatRoom) {
		return chatMapper.createChatRoom(chatRoom);
	}
	
	public int saveChat(Chat chat) {
		return chatMapper.saveChat(chat);
	}
	
	public List<ChatDTO> chatView(long chatRoomId) {
		ChatRoomDTO chatRoom = chatRoomView(chatRoomId);
		logger.info("chatRoom : {}",chatRoom);
		logger.debug("chatRoom : {}",chatRoom);
		List<ChatDTO> chatLists = chatRoom.getChatRoomsChats();
		chatLists = chatMapper.chatView(chatRoomId);
		
		return chatLists;
	}

	public ChatRoomDTO chatRoomView(long chatRoomId) {
		
		return chatMapper.chatRoomView(chatRoomId);
	}
	
	public List<ChatRoomDTO> chatRoomView(String keyword){
		return chatMapper.chatRoomView(keyword);
	}
}
