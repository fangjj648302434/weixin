package com.example.weixin.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class InMessage implements Serializable {
	private static final long serialVersionUID=1L;
	@XmlElement(name="ToUserName")
	private String toUserName;
	
	@XmlElement(name="FromUserName")
	private String fromUserName;
	
	@XmlElement(name="CreateTime")
	private String createTime;
	
	@XmlElement(name="MsgType")
	private String msgType;
	
	@XmlElement(name="MsgId")
	private Long msgId; 
	
	public InMessage() {}
	
	protected InMessage(String type) {
		this.msgType=type;
	}


	private String getToUserName() {
		return toUserName;
	}


	private void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}


	private String getFromUserName() {
		return fromUserName;
	}


	private void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}


	private String getCreateTime() {
		return createTime;
	}


	private void setCreateTime(String createTime) {
		this.createTime = createTime;
	}


	private String getMsgType() {
		return msgType;
	}


	private void setMsgType(String msgType) {
		this.msgType = msgType;
	}


	private Long getMsgId() {
		return msgId;
	}


	private void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	

	
}
