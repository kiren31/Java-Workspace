package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
	         System.out.println("1. 지정 문자열 ");
	         System.out.println("2. 입력 문자열 ");
	         System.out.println("9. 프로그램 끝내기");
	         System.out.print("메뉴 번호 : ");
	         int num = sc.nextInt();
	         
	         switch(num) {
	         case 1: tokenMenu(); break;
	         case 2: inputMenu(); break;
	         case 9: return;
	         default: System.out.println("잘못 입력했습니다. 다시입력해주세요");
	         }
	      }
		
		
		
	}
	
	public void tokenMenu() {
		
		String str = “J a v a P r o g r a m “; 
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		
		
		
	}
	
	public void inputMenu() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
			// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
			
			// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
			// 반환 값 출력
		
	}
	
	
}


