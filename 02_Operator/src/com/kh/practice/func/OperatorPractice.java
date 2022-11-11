package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+(num2 / num1));
		System.out.print("남는 사탕 개수 : "+(num2 % num1));
		
		// System.out.print("인원 수 : ");
		// int persons = sc.nextInt();

		// System.out.print("사탕 개수 : ");
		// int candys = sc.nextInt();
		
		// System.out.println("1인당 사탕 개수 : "(candys / persons));
		// System.out.println("남는 사탕 개수 : "(candys % persons));
		
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num =  sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		
		System.out.print("\n"+grade+"학년 "+group+"반 "+num+"번 "+name+" 남학생의 성적은 "+score+"이다. ");
		sc.nextLine();
		
		// System.out.print("이름 : ");
		// String name = sc.nextLine();
		
		// System.out.print("학년(숫자만) : ");
		// int grade = sc.nextInt();
		
		// System.out.print("반(숫자만) : ");
		// int classes = sc.nextInt();
		
		// System.out.print("번호(숫자만) : ");
		// int number =  sc.nextInt();
		
		// sc.nextLine();
		
		// System.out.print("성별(M/F) : ");
		// char gender = sc.nextLine().charAt(0);
		
		// System.out.print("성적(소수점 아래 둘째자리까지) : ");
		// double test = sc.nextDouble();
		
		// System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2이다f",grade, classes, number
		// , name, (gender == 'M'? "남학생" : "여학생"), test);
		
		//
		
		
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인");
		
		System.out.println("\n"+result);
		
		// System.out.print("나이 : ");
		// int age = sc.nextInt();
		
		// String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		
		// System.out.println("\n"+result);
		
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("\n"+ "합계 : " +(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3.0);
		
		String result = (kor >= 40) && (eng >= 40) && (math >= 40) && ((kor+eng+math)/3) >=60  ? "합격" : "불합격" ;
		
		System.out.print(result);
		
		// System.out.print("국어 : ");
		// int kor = sc.nextInt();
				
		// System.out.print("영어 : ");
		// int eng = sc.nextInt();
				
		// System.out.print("수학 : ");
		// int math = sc.nextInt();
		
		// int sum = kor + eng + math;
		
		// double avg = sum / 3.0;
		
		// String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		
		// System.out.println("합계 : " +sum);
		// System.out.println("평균 : " +avg);
		// System.out.print(result);
		
		
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char gender = sc.nextLine().charAt(7);
		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		
		System.out.println("\n"+result);
		
		// System.out.print("주민번호를 입력하세요(- 포함) : ");
		// String resNo = sc.nextLine(); // 901225-1234567
		// char gender = resno.charAt(7); // '1' , '2' , '3' , '4'
		
		// String result = (gender == '1' || gender == '3') ? "남자" : "여자" ;
		// '1' == 1 -> 49 == 1 , '2' == 1 -> 50 == 1
		
		// System.out.println(result);
		
	}


	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = (num3<=num1)||(num3>num2)? "true" : "false";
		
		System.out.print("\n"+result);
		
		// System.out.print("정수1 : ");
		// int num1 = sc.nextInt();
		
		// System.out.print("정수2 : ");
		// int num2 = sc.nextInt();
		
		// System.out.print("입력 : ");
		// int num3 = sc.nextInt();
		
		// boolean result = (num3 <= num1 || num3 > num2) ? "true" : "false";
		
		// System.out.print(result);
		
		
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 ==  num3;
		System.out.println("\n"+result);
		
		// System.out.print("입력1 : ");
		// int num1 = sc.nextInt();
		
		// System.out.print("입력2 : ");
		// int num2 = sc.nextInt();
		
		// System.out.print("입력3 : ");
		// int num3 = sc.nextInt();
		
		// System.out.println((num1 == num2 && num2 == num3) ? true : false);
		
		
		
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int pay1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int pay2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int pay3 = sc.nextInt();
		
		double pay1a = pay1 *1.4;
		double pay2a = pay2;
		double pay3a = pay3 *1.15;
		
		System.out.println("A사원 연봉/연봉+a : 2500/3500.0");
		System.out.println((pay1a >= 3000) ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : 2900/2900.0");
		System.out.println((pay2a >= 3000) ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : 2600/2989.9999999999995");
		System.out.println((pay3a >= 3000) ? "3000 이상" : "3000 미만");
		
		// System.out.print("A사원의 연봉 : ");
		// int personA = sc.nextInt();
		
		// System.out.print("B사원의 연봉 : ");
		// int personB = sc.nextInt();
		
		// System.out.print("C사원의 연봉 : ");
		// int personC = sc.nextInt();
		
		// double personAtotal = personA * 1.4;
		// double personBtotal = personB;
		// double personCtotal = personC * 1.15;
		
		// System.out.println("A사원 연봉/연봉+a : "+personA+"/"+personAtotal");
		// System.out.println((personAtotal >= 3000) ? "3000 이상" : "3000 미만");
		
		// System.out.println("B사원 연봉/연봉+a : "+personB+"/"+personBtotal");
		// System.out.println((personBtotal >= 3000) ? "3000 이상" : "3000 미만");
		
		// System.out.println("C사원 연봉/연봉+a : "+personC+"/"+personCtotal");
		// System.out.println((personCtotal >= 3000) ? "3000 이상" : "3000 미만");
	}
}
