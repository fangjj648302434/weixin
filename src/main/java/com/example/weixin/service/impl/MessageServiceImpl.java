package com.example.weixin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.weixin.controller.MessageReceiverController;
import com.example.weixin.domain.InMessage;
import com.example.weixin.domain.OUtMessage;
import com.example.weixin.service.MessageService;


@Service
public class MessageServiceImpl implements MessageService{
	private static final Logger LOG=LoggerFactory.getLogger(MessageReceiverController.class);
	@Override
	public OUtMessage onMessage(InMessage msg) {
		// TODO Auto-generated method stub
		LOG.trace("转换后消息对象：\n{}\n",msg);
		return null;
	}

}
