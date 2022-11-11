package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감연산자(단항연산자) ++ -- 
	 * ++ : 변수의 담긴 값을 1 증가시키는 연산자
	 *		++변수 (전위연산자) 변수++ (후위연산자)
	 * -- : 값을 1 감소시키는 연산자
	 * 		--변수 (전위연산자) 변수-- (후위연산자)
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선증감 후처리.
	 * 변수(증감연산자) : 후위연산 -> 선처리 후증감.
	 */
	
	public void method1() {
		//전위연산 테스트
		int num = 10;
		System.out.println("전위연산 적용 전 num : "+num); //10
		System.out.println("1회 수행후 결과 : "+ ++num); // 10에서 증감연산을 먼저 실행하여 11로 num값을 증가시키고
													 // 최종적으로 11이 출력됨.
		System.out.println("2회 수행후 결과 : "+ ++num); // 현재 num = 11이 담겨있음 따라서 12가 출력됨.
		System.out.println("3회 수행후 결과 : "+ ++num); // 13
		
		System.out.println("최종 num : "+ num);
		
		System.out.println("======================");
		
		//후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num : "+num2); //10
		System.out.println("1회 수행후 결과 : "+ num2++); // 10출력 후 1증가
		// 즉, 출력당시에는 10이 출력되고, 출력처리가 끝나고 나서 11로 증감처리됨.
		System.out.println("2회 수행후 결과 : "+ num2++); // 11출력 후 1증가 num2 = 12
		System.out.println("3회 수행후 결과 : "+ num2++); // 12출력 후 1증가 num2 = 13
		
		System.out.println("최종 num2 : "+ num2);
	}
	
	public void method2( ) {
		// 전위연산 
		int a = 10;
		int b = ++a;
		System.out.println("a : "+a +", b : "+ b); // 11 , 11
		
		// 후위연산
		int c = 10;
		int d = c++; //
		System.out.printf("c : %d , d : %d \n",  c,d); // 11 , 10
		
		//==================
		//예측
		int num = 20;
		System.out.println("현재 num : " +num); // 20
		System.out.println("++num ? "+ ++num); // 21
		System.out.println("num++ ? "+ num++); // 21 num = 22
		System.out.println("--num ? "+ --num); // 21 
		System.out.println("num-- ? "+ num--); // 21 num = 20
		
		System.out.println("최종 num ? "+num); // 20
		
	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ *3; // result1 = 20 * 3연산 후 num1 = num1 + 1
		
		System.out.println("num1 : "+num1);
		System.out.println("result1 : "+result1);
		
		int num2 = 20;
		int result2 = ++num2 *3; // num2 =num2+1 연산 후 result2 = 21 * 3
		
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// 주석으로 어떻게 값이 출력될지 예상해보기.
		System.out.println(a++); // 10  a = 11
		System.out.println((++a) + (b++)); // 32 a= 12 b = 21
		System.out.println((a++)+(--b)+(--c)); // 12 20 29 = 61 a= 13 b = 20 c = 29
		System.out.println("a : "+a+", b : "+b+", c: "+c); // 13, 20, 29 
	}
	
	public void quiz() {
		
		int a = 5;
		int b = 10;
		int c = (++a) +b; // a = 6  c = 16
		
		int d = c / a;  // d = 2
		int e = c % a;  // e = 4
		
		int f = e++; // f = 4 , e = 5
		int g = (--b) + (d--); // g = 11 , d = 1 , b = 9
		int h = 2; // h = 2
		
		int i = (a++) + b / (--c /f) * (g-- - d) % (++e +h); // (6) + 9 / (15/4) * (11-1) % (6+2)
		// 6 + 9 / 3 * 10 % 8
		// 연산자 우선순위가 동일하다면 앞에것 먼저 실행시킴.
		// 6 + 30 % 8
		
		
		System.out.println("a : "+a); // 
		System.out.println("b : "+b); // 
		System.out.println("c : "+c); // 
		System.out.println("d : "+d); // 
		System.out.println("e:  "+e); // 
		System.out.println("f : "+f); // 
		System.out.println("g : "+g); // 
		System.out.println("h : "+h); // 
		System.out.println("i : "+i); //
		
		
		
	}
}
