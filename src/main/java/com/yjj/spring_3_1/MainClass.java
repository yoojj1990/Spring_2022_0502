package com.yjj.spring_3_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyCalculator mycal = new MyCalculator();
		Calculator cal = new Calculator();
		
		mycal.setCalcu(cal); // 멤버객체 cal 초기화
		
		mycal.setA(10); // 멤버변수 a 초기화
		mycal.setB(20); // 멤버변수 b 초기화
		
		mycal.add();
		
	}

}
