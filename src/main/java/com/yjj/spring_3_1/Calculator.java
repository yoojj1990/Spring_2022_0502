package com.yjj.spring_3_1;

public class Calculator {

	public void additioin(int a, int b) {
		int result = a + b;
		System.out.println("-- 덧셈 --");
		System.out.println(a + " + " + b + " = " + result);
		}
	
	public void subtraction(int a, int b) {
		int result = a - b;
		System.out.println("-- 뺄셈 --");
		System.out.println(a + " - " + b + " = " + result);
	}
	
	
	public void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("-- 곱셈 --");
		System.out.println(a + " * " + b + " = " + result);
	}
	
	public void division(int a, int b) {
		int result = a / b;
		System.out.println("-- 나눗셈 --");
		System.out.println(a + " / " + b + " = " + result);
	}
}
