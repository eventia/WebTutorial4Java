package com.ludens.gugudan;
public class Gugudan {

	// 메소드(함수) 사용
	public int multiply2numbers(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a;
		int b;
		// 1단계 - 객체를 만든다.
		Gugudan gugu = new Gugudan();
		for(b=2; b<10; b++) {
			for(a=1; a<10; a++ ) {
				// 2단계 - 만든 객체안에 있는 메소드를 사용한다.
				System.out.println(b + " * " + a + " = " + gugu.multiply2numbers(a,b));
			}
		}
	}
}
