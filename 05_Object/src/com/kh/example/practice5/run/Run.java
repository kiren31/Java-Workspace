package com.kh.example.practice5.run;

import com.kh.example.practice5.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		//Circle cc = new Circle();
		
		
		//cc.incrementRadius();
		
		Book b = new Book();
		b.inform();
		
		Book b2= new Book("자바의 정석","나무","민경민"); // title , publisher, author
		b2.inform();
		
		Book b3 = new Book("자바의 정석","나무","민경민", 15000 , 0.0);
		b3.inform();
		
		
		//new Lotto().information();;
		
		
		
	}

}
