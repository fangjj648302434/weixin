package com.example.weixin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.example.weixin.controller.MessageReceiverController;
import com.example.weixin.domain.InMessage;
import com.example.weixin.domain.OUtMessage;
import com.example.weixin.service.MessageService;


@Service
public class MessageServiceImpl implements MessageService{
	private static final Logger LOG=LoggerFactory.getLogger(MessageReceiverController.class);
	
	@Autowired // 自动注入
	@Qualifier("inMessageTemplate") // 根据名字自动注入
	private RedisTemplate<String, ? extends InMessage> inMessageTemplate;
	
	@Override
	public OUtMessage onMessage(InMessage msg) {
		// TODO Auto-generated method stub
		LOG.trace("转换后消息对象：\n{}\n",msg);
		inMessageTemplate.convertAndSend("test_weixin"+msg.getMsgType(), msg);
		return null;
	}

}
