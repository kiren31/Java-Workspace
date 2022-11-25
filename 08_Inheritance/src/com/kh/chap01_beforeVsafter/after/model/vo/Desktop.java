package com.kh.chap01_beforeVsafter.after.model.vo;


public class Desktop extends Product {
	
	
	private boolean allInOne;
	
	public Desktop() {
	
	}



	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super => 부모클래스의 주솟값을 보관하고 있음. (즉 super.으로 부모에 접근가능)
		// brand, pCode, pName, price를 부모클래스의 Product에 있는 필드에 초기화(대입)
		
		// 해결방법 1. 부모클래스의 필드를 자식까지는 접근 가능하도록 접근 제한자를 변경
		//			 private -> protected로 변경
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		// 해결방법 2. 부모클래스에서 접근할수 있는 (public) setter 메서드 활용
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결방법 3. 부모생성자 호출하기 단, 반드시 첫줄에 기술되어야한다.
		
		super(brand,pCode,pName,price);
		this.allInOne = allInOne;
		
		
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean getAllInOne() {
		return allInOne;
	}
	
	// 오버라이딩 : 부모클래스의 메소드를 내 입맛대로 정의하는것.
	public String informaton () {
		return super.information()+", allInOne : "+allInOne;
	}
	
	
}
