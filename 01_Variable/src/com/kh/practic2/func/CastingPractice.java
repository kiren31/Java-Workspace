package com.kh.practic2.func;

import java.util.Scanner;

public class CastingPractice {

	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		
		System.out.print("국어 : ");
		double score1 = sc.nextDouble();
		System.out.print("영어 : ");
		double score2 = sc.nextDouble();
		System.out.print("수학 : ");
		double score3 = sc.nextDouble();
		
		System.out.println("총점 : "+(int)(score1+score2+score3));
		System.out.println("평균 : "+((int)(score1+score2+score3)/3));
		
		int sum = (int)(score1+score2+score3);
		int avg = sum/3;
		
		System.out.printf("총점 : %d \n",  sum);
		System.out.printf("평균 : %d \n", avg);
	
		
	}
}
