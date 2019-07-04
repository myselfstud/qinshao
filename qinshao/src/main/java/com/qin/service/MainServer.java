package com.qin.service;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@SpringBootApplication
public class MainServer {
	
	// 为当前的类文件生成日志处理对象
	private final Logger log=LoggerFactory.getLogger(MainServer.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MainServer.class, args);
	}
	
	@RequestMapping(value = "/gethello")
	
	public @ResponseBody String gethello(){
		
		log.info("Hello world is testing !");
		
		return "hello world !";
		
	}
	
}