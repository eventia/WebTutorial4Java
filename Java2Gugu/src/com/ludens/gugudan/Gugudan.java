package com.ludens.gugudan;
public class Gugudan {

	// �޼ҵ�(�Լ�) ���
	public int multiply2numbers(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a;
		int b;
		// 1�ܰ� - ��ü�� �����.
		Gugudan gugu = new Gugudan();
		for(b=2; b<10; b++) {
			for(a=1; a<10; a++ ) {
				// 2�ܰ� - ���� ��ü�ȿ� �ִ� �޼ҵ带 ����Ѵ�.
				System.out.println(b + " * " + a + " = " + gugu.multiply2numbers(a,b));
			}
		}
	}
}
