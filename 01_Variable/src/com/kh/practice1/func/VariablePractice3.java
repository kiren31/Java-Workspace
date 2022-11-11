package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public void test3() {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("가로 :");
	double num1 = sc.nextDouble();
	System.out.print("세로 :");
	double num2 = sc.nextDouble();
	
	System.out.println("면적 : "+(num1*num2));
	System.out.println("둘레 : "+((num1+num2)*2));
	
	}
}
