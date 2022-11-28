package com.kh.practice.chp02_abstractNinterface.model.vo;

public class GalaxyNote9 extends SmartPhone {

	
	
	public GalaxyNote9() {
		super();
	}

	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
		
	}
	
	public String takeCall() {
		return "수신 버튼을 누름";
		
	}
	

	public String picture() {
		return "1200만 듀얼 카메라";
		
	}
	

	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	

	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return true;
		
	}
	
	
	public String printinformation() {
		return "갤력시 노트9은 삼성에서 만들어졌고 제원은 다음과 같다."+makeCall()+"\n"+takeCall()+"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n"+bluetoothPen();
	}
}
