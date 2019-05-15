package com.example.weixin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.xml.StaxUtils;

import com.example.weixin.domain.InMessage;
import com.example.weixin.service.impl.JsonRedisSerializer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


@SpringBootApplication
public class WeixinApplication {
	
	@Bean
	public XmlMapper xmlMapper() {
		XmlMapper mapper=new XmlMapper(StaxUtils.createDefensiveInputFactory());
		return mapper;
	}

	
	//这是个访问数据库的模版
	
	
	
	
	@Bean
	public RedisTemplate<String, ? extends InMessage> inMessageTemplate(@Autowired RedisConnectionFactory connectionFactiory){
		
		RedisTemplate<String, ? extends InMessage> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactiory);
		
		template.setValueSerializer(new JsonRedisSerializer<InMessage>());
		
		return template;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

}
