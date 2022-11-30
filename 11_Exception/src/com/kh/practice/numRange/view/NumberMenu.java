package com.kh.practice.numRange.view;

import java.util.Scanner;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d은(는) %d의 배수인가 ? "+num1,num2);
		
		
	}
}
