package com.alibaba.dubbo.demo.pp;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unj.dubbotest.provider.DemoService;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();
		System.out.println("对应接口已创建!");
		try {
			DemoService demoService = (DemoService) context.getBean("demoService");
			String hello = demoService.sayHello("tom");
			System.out.println(hello);
			List list = demoService.getUsers();
			System.out.println("list的长度为:" + list.size());
			if (list != null && list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("发现异常:"+e);
		}
		System.out.println("执行完毕!");
		System.in.read();
	}

}