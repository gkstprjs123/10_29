package com.human.ex;

public class Java003 {

	public static void main(String[] args) {
		function1();
		function3();
		function4();

	}
	
	public static void function1() {
		System.out.println("====함수 1 시작====");
		System.out.println("====함수 1 종료====");
		function2();
	}
	public static void function2() {
		System.out.println("====함수 2 시작====");
		System.out.println("====함수 2 종료====");
	}
	public static void function3() {
		System.out.println("====함수 3 시작====");
		System.out.println("====함수 3 종료====");
	}
	public static void function4() {
		System.out.println("====함수 4 시작====");
		System.out.println("====함수 4 종료====");
	}

}
