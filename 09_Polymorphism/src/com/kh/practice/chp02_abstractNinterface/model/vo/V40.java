package com.kh.practice.chp02_abstractNinterface.model.vo;

public class V40 extends SmartPhone {

	public V40() {
		super();
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	

	public String picture() {
		return "1200, 1600만 트리플 카메라";
		
	}
	

	public String charge() {
		return "고속 충전, 고속 무선 충전";
		
	}
	

	public String touch() {
		return "정전식";
	}
	
	public boolean bluetoothPen() {
		return false;
		
	}
	
	
	public String printinformation() {
		return "V40은 LG에서 만들어졌고 제원은 다음과 같다."+makeCall()+"\n"+takeCall()+"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n"+bluetoothPen();
	}

	
	
	
	
}


