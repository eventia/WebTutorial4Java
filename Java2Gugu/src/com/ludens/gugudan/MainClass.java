package com.ludens.gugudan;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gugudan gdan = new Gugudan(2);

		for(int i=2; i<10; i++) {
			gdan.setDan(i);
			gdan.gugucalc();
		}
	}
}
