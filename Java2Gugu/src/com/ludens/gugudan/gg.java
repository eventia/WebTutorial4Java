package com.ludens.gugudan;

public class Gugudan {

	public static void main(String[] args) {
		int a;
		int b;
		for(b=2; b<10; b++) {
			for(a=1; a<10; a++ ) {
				int c = a * b;
				System.out.println(b + " * " + a + " = " + c);
			}
		}
	}
}

============================================

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

============================================

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

============================================

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

=================================================

package com.ludens.guguclass;

public class Main {

	public static void main(String[] args) {
		Gugu gdan = new Gugu(2);

		for(int i=2; i<10; i++) {
			gdan.setDan(i);
			gdan.gugucalc();
		}
	}
}

//////////////////////////////////

package com.ludens.guguclass;

public class Gugu {
	
	private int dan;
	
	public Gugu(int dan) {
		super();
		this.dan = dan;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public void gugucalc() {
		
		System.out.println(dan + " X " + "1" + " = " + dan*1);
		System.out.println(dan + " X " + "2" + " = " + dan*2);
		System.out.println(dan + " X " + "3" + " = " + dan*3);
		System.out.println(dan + " X " + "4" + " = " + dan*4);
		System.out.println(dan + " X " + "5" + " = " + dan*5);
		System.out.println(dan + " X " + "6" + " = " + dan*6);
		System.out.println(dan + " X " + "7" + " = " + dan*7);
		System.out.println(dan + " X " + "8" + " = " + dan*8);
		System.out.println(dan + " X " + "9" + " = " + dan*9);

//		for(int i=1; i<10; i++) {
//			System.out.println(dan + " X " + i + " = " + dan*i);
//		}
		
	}

}
