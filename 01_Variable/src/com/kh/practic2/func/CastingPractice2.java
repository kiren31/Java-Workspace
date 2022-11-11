package com.kh.practic2.func;

public class CastingPractice2 {
	public void test2() {
	
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); 
		System.out.println((int)dNum);
		
		System.out.println(iNum2*dNum);
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1/iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum); 
		System.out.println( (int)iNum1/fNum); // 3
		
		System.out.println(iNum1 / fNum);// 3.3333333
		System.out.println((double)iNum1/ fNum ); // 3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch+iNum1 ); // 75
		System.out.println( ((char)(ch+iNum1)) ); // 'K'
	}
	

	
	
		
		
		

}
