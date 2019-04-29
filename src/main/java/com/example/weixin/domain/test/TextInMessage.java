package com.example.weixin.domain.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.weixin.domain.InMessage;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextInMessage extends InMessage{
	
	private static final long seriaVersionUID=1L;
	@XmlElement(name ="Content")
	private String content;

	public TextInMessage() {
		super("text");
		// TODO Auto-generated constructor stub
	}

	private String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = content;
	}
	

}
