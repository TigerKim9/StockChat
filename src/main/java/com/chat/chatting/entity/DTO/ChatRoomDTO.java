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
	
	//채팅방 고유번호
	private long chatRoomId;
	
	//채팅방 이름
	private String chatRoomsName;
	
	//채팅방 생성 날짜
	private LocalDateTime madeRoomChatDay;
	
	// 채팅방에 있는 채팅 목록
	private List<ChatDTO> chatRoomsChats;

	// 채팅방 숨김여부 0:공개  1: 숨김
	private boolean hide;
	
	//채팅방 상단 고정 여부 0:비고정 1:고정
	private boolean top;
	
	//채팅방 알림 켜기/끄기  0:끄기 1:켜기
	private boolean alert;
	
	//채팅방 삭제여부 0:존재 1:삭제됨
	private boolean deleted;

}
