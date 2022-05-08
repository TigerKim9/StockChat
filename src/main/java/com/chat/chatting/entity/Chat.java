package com.chat.chatting.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Chat {
	
	private long ChatId;
	
	private long chatRoomId;

	private String userName;
	
	private String chatContents;
	
	private String chatDateTime;
	
	private boolean sended; 
}
