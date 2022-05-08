package com.chat.chatting.entity.DTO;

import java.time.LocalDateTime;
import java.util.List;

import com.chat.chatting.entity.Chat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatRoomDTO {
	
	private long chatRoomId;
	
	private String chatRoomsName;
	
	private LocalDateTime madeRoomChatDay;
	
	private List<ChatDTO> chatRoomsChats;

	
	
	
	

}
