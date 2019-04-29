package com.example.weixin.domain.test;

import javax.xml.bind.annotation.XmlElement;

import com.example.weixin.domain.InMessage;

public class EventInMessage extends InMessage {

	private static final long seriaVersionUID=1L;
	@XmlElement(name ="Event")
	private String event;
	
	@XmlElement(name ="EventKey")
	private String eventKey;
	
	public EventInMessage() {
		super("event");
		// TODO Auto-generated constructor stub
	}
}
