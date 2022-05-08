package com.chat.chatting.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatRoom {
	
	private long chatRoomId;
	
	private String chatRoomsName;
	
	private List<ChatDTO> chatRoomsChats;
	
	

}
