package com.example.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.weixin.domain.InMessage;
import com.example.weixin.domain.test.EventInMessage;
import com.example.weixin.domain.test.TextInMessage;

public class MessageTypeRegister {
	
	private static Map<String, Class<? extends InMessage>> typeMap =new ConcurrentHashMap<String, Class<? extends InMessage>>();
	
	static {
		register("text", TextInMessage.class);
		register("event", EventInMessage.class);
		register("location", TextInMessage.class);
		register("image", TextInMessage.class);
		register("video", TextInMessage.class);
		register("shortvideo", TextInMessage.class);
		register("voice", TextInMessage.class);
		
	}
	
	
	
	public static void register(String type, Class<? extends InMessage> cla) {
		
		typeMap.put(type, cla);
	}
	
	public static  Class<? extends InMessage> getClass(String type){
		return typeMap.get(type);
		
	}
	

}
