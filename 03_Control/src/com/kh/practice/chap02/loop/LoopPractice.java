package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : " );
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" "); 
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
	}

	public void practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : " );
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
			
		} else {
			for(int i = num; i > 0 ; i--) {
				System.out.print(i+" "); 
			}
			
		
		}
		
	}

	public void practice3(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			int sum = 0;
			for(int i = 1; i<= num; i++) {
				if(i == num) {
				System.out.print(i);
				}else {
					System.out.print(i+" + ");
				}
				sum += i;
			}
			System.out.println(" = "+sum);
		}
		
		
	}
	
	public void practice4(){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int num1;
		int num2;
	
		if(input1 < 1 || 1 > input2) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice4();
		} else {
			if(input1 < input2) {
				num1 = input1;
				num2 = input2;
			} else {
				num1 = input2;
				num2 = input1;
		  }
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
		
		// System.out.print("첫 번째 숫자 : ");
		// int num1 = sc.nextInt();
		
		// System.out.print("두 번째 숫자 : ");
		// int num2 = sc.nextInt();
		
		// if(num1 < 1 || num2 < 1) {
		// System.out.println("1 이상의 숫자를 입력해주세요.");
		// practice4();
		// }else {
		//		if(num1 <= num2){
		//			for(int i= num1; i <= num2; i++) {
		//				System.out.print(i+" ");
		//			}
		//		}else {
		//			for(int i = num2; i<= num1l i++) {
		
	
		
		
		
	}
	
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan >= 9) {
		System.out.println("9 이하의 숫자만 입력해주세요.");
		practice5();
		
		}else {
			for(int i = dan; i<= 9;i++) { // i 에 입력받은값 대입후 9까지 증가시키며 반복
				System.out.println("===== " + i + "단 =====");
			for(int j = 0; j < 9; j++)
				System.out.println(i + " X " + (j + 1) + " = " + i * (j + 1));
			System.out.println();
		}
			}
		
	}
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = num1; i <= num1+num2*9; i += num2) {
			System.out.print(i+" ");
		}
		
		// System.out.print("시작 숫자 : ");
		// int num = sc.nextInt();
		// System.out.print("공차 : ");
		// int gong = sc.nextInt();
		
		// for(int i=1; 1<=10 i++) {
		//		System.out.print(num+" ");
		//		num+= gong;
		
		
	}
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num ; i++) {
			for(int j = 0; j < i + 1; j++)
			System.out.print("*");
			System.out.println();
		}
		
	}
	
	// for(int i = 1; i <= num; i++) {
	//	 for(int j = 0; j < i; j++)
	// 		System.out.print("*");
	//	}
	//		System.out.println();
	
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num ; i++) {
			for(int j = num; j > i ; j--)
			System.out.print("*");
			System.out.println();
		}
		
	}
	
	// for(int i = num; i >= 1; i--) { 
	// 	for(int j = 1; j<= i; j++) {
	// 		System.out.print("*");
	
	public void practice10(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");
			
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		
		}
		
	}
	
	// for(int i = 0; i < num; i++) {
	// }
	// for(int j = 1 ; j < num - i; j++) {
	//		System.out.print(" ");
	// }
	// for(int j = 1; j < 2 + i ; j++)
	//		System.put.print("*");
	// }
	// 		System.out.println();
	
	public void practice11(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num ; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
				for(int j = num; j > i ;j--) {
			System.out.print("*");
		}
				System.out.println();
		}
		
	}
	
	// for(int i = 0; i< num; i++) {
	// 	for(int j = 0; j < i; j++) {
	//		System.out.print(" ");
	// }
	//  for(int j = 0; j< num - 1; j++) {
	// 		System.out.print("*");
	// } 
	// System.out.println();
	
	public void practice12(){ 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");
			
			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	// for(int i = 0; i < num; i++) {
	// for(int j = 0; j < num -(1 + i); j++) {
	//		System.out.print(" ");
	// }
	// for(int j = 0; j < 1+2*i; j++) {
	//		System.out.print("*");
	// }
	// System.out.println();
	
	
	public void practice13(){
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 …
//		ex. 
//		숫자 : 5 숫자 : 9 숫자 : 0
//		소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.
//		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				System.out.print("소수가 아닙니다.");
			}else {
				System.out.println("소수 입니다.");
			}
		}
		
		
		
		
		
		
	}
	
	public void practice14(){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 if(num < 2 ) {
			 System.out.println("잘못 입력하셨습니다.");
			 return;
		 }
		 int count = 0;
		 for(int i = 2; i<=num; i++) {
			 boolean isPrime = true;
			 // i값이 소수인지 아닌지 검사를 함.
			 for(int j = 2; j < i; j++) {
				 if(i % j == 0) {
					 isPrime = false;
					 //break;
					 
				 }
			 }
			 if(isPrime == true) {
				 System.out.print(i + " ");
				 count++;
			 }
			 // i값이 소수라면 출력을 하고, 값을 1 증가시킴.
			 
		 }
		 
		 System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.", num, count);
		
		
	}
	public void practice15(){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < num; i++) {
			if ((i + 1) % 2 == 0 || (i + 1) % 3 == 0) {
				System.out.print(i + 1 + " ");
				if ((i + 1) % (2 * 3) == 0) count++;
			}
		}
		System.out.println("\ncount : " + count);
		
	}
	public void practice16(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < num - 1; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print("*");
			System.out.println();
	}
		
	}
	public void practice17(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (row == 0 || row == num - 1 || col == 0 || col == num - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	}
		
	}
	public void practice18(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num-1; i++) {
			for(int j = 0; j < 1+i; j++) {
				System.out.print(" ");
		}
		for(int j = 0; j < (num - i) * 2 -3; j++) {
			System.out.print("*");
		}
	
		System.out.println();
		}
		
		
	}
	public void practice19(){
		
	}



	
	

}
