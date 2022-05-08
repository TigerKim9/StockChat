package com.chat.chatting.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.chat.chatting.entity.Chat;
import com.chat.chatting.entity.ChatDTO;
import com.chat.chatting.entity.ChatRoom;
import com.chat.chatting.mapper.ChatMapper;

@Service
public class ChatService {
	
	ChatMapper chatMapper;
	Logger logger = LoggerFactory.getLogger(ChatService.class);
	
	public int createChatRoom(ChatRoom chatRoom) {
		return chatMapper.createChatRoom(chatRoom);
	}
	
	public int saveChat(Chat chat) {
		int result = 0;
		List<ChatRoom> chatRoom = chatRoomView(chat.getChatRoomId());
		List<ChatDTO> chatlists = crv.getChatRoomsChats();
		for(ChatDTO chatlist : chatlists) {
			crv.setChatRoomsChats(chatlists);
		}
		return result;
	}
	
	public List<ChatDTO> chatView(long chatRoomId) {
		List<ChatRoom> chatRoom = chatRoomView(chatRoomId);
		logger.info("chatRoom : {}",chatRoom);
		logger.debug("chatRoom : {}",chatRoom);
		List<ChatDTO> chatLists = chatRoom.getChatRoomsChats();
		
		for(ChatDTO chatList : chatLists) {
			
		}
		return chatMapper.chatView(chatRoomId);
	}

	public List<ChatRoom> chatRoomView(long chatRoomId) {
		
		return chatMapper.chatRoomView(chatRoomId);
	}
}
