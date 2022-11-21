package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 3;
		classroom = 15;
		name = "이해민";
		height = 180.5;
		gender = '남';
		
	}
	
public Student() {
	
}

public void setGrade(int grade) {
	this.grade = grade;
}
public  void setClassroom(int classroom) {
	this.classroom = classroom;
}

public void setName(String name) {
	this.name = name;
}


public void setHeight(double height) {
	this.height = height;	
}

	
public void setGender(char gender) {
	this.gender = gender;
		

}
// getter 메서드 3개
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void information() {
		
	  System.out.printf("%s 학생은 %d학년이고 %d반이며, 키는 %.1fcm이고 %c학생입니다.",name,grade,classroom,height,gender);
	
	
	}



}
