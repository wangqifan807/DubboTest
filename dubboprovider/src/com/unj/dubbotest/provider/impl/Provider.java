package com.unj.dubbotest.provider.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.out.println("提供接口启动!");
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}