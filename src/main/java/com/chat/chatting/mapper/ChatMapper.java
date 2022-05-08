package com.chat.chatting.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.chat.chatting.entity.Chat;
import com.chat.chatting.entity.ChatDTO;
import com.chat.chatting.entity.ChatRoom;

@Mapper
@Repository
public interface ChatMapper {
	
	//chat 저장
	int saveChat(Chat chat);

	//chat 보이기
	List<ChatDTO> chatView(long chatRoomId);
	
	//채팅방 만들기
	int createChatRoom(ChatRoom chatRoom);
	
	//채팅방 불러오기
	List<ChatRoom> chatRoomView(long chatRoomId);
}
