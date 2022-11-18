package com.kh.example.practice5.model.vo;

public class Circle {

	// 필드부
	private final static double PI =3.14;
	private int radius = 1;

	//생성자부
	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle();

	}

	//메서드부
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	
	//원의 둘레 2*반지름*원주율
	public void getAreaOfCircle() {
		System.out.println(2 * radius * PI);
	}
	
	//원의 넓이 반지름*반지름*원주율
	public void getSizeOfCircle() {
		System.out.println(PI * radius * radius);
	}
	



}

