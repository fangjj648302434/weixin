package com.example.weixin.service;

import com.example.weixin.domain.InMessage;
import com.example.weixin.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
