package com.yjj.spring_3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		MyCalculator myCal = new MyCalculator();
//		Calculator cal = new Calculator();
		
//		mycal.setCalcu(cal); // 멤버객체 cal 초기화
//		
//		mycal.setA(10); // 멤버변수 a 초기화
//		mycal.setB(20); // 멤버변수 b 초기화
		
		String configLocation = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// 컨테이너 생성 및 ctx 생성
		MyCalculator myCal = ctx.getBean("myCal", MyCalculator.class); //컨테이너에서 빈(객체) 주입
		
		
		myCal.add();
		
	}

	
}
