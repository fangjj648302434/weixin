package com.example.weixin.domain.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.weixin.domain.InMessage;

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
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
