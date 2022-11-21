package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {
		MethodTest1 mt = new MethodTest1();
		//mt.method1();
		int random = mt.method2();
		System.out.println("랜덤값 : "+mt.method2());
		
		mt.method3(60 , 15);
		
		System.out.println(mt.method4(42, 5));
		
		System.out.println("==================================");
		
		// static 메소드의 경우에 new 문으로 객체를 생성할필요가 없다.
		// static이 붙은 클래스변수와 마찬가지로, 메소드 또한 프로그램 실행시 정적메모리영역에 저장되기때문.
		MethodTest2.method1();
		
		//MethodTest1.method();
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("민경민", 33); // String, int		
		
		System.out.println(MethodTest2.method4(100));
		
		
		

	}

}
