package com.chat.chatting.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChatDTO {

	private String userName;
	
	private String chatContents;
	
	private String chatDateTime;
	
	private boolean sended; 
}
