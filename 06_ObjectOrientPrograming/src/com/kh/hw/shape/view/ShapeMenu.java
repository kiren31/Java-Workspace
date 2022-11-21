package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
	
			System.out.println(" 잘못된 번호입니다. 다시 입력하세요.");
			
		
		
	}
	
	public void triangleMenu() {
		System.out.print("===== 삼각형 =====");
		System.out.print("1. 삼각형 면적");
		System.out.print("2. 삼각형 색칠");
		System.out.print("3. 삼각형 정보");
		System.out.print("9. 메인으로 ");
		
	
		
		
	}
	
	public void squareMenu() {
		
		System.out.print("1. 사각형 둘레");
		System.out.print("2. 사각형 면적");
		System.out.print("3. 사각형 색칠");
		System.out.print("4. 사각형 정보");
		System.out.print("9. 메인으로 ");

		
	}
	
	public void inputSize(int type, int menuNum) {
		System.out.println();
	}
	
	public void printInformation(int type) {
		
	}
}
