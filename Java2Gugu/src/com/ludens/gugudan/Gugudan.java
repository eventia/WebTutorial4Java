package com.ludens.gugudan;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
//		a = 2;
//		b = 2;
		
		for(b=2; b<10; b++) {
			for(a=1; a<10; a++ ) {
				int c = a * b;
				System.out.println(b + " * " + a + " = " + c);
			}
		}

	}

}
