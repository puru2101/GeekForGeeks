package com.p1;

class A {
	void m1() {
		System.out.println("m1 in A");
	}
	void m4() {
		System.out.println("m4 in A");
	}
}

class B extends A {
	void m1() {
		System.out.println("m1 in B");
	}

	void m2() {
		System.out.println("m2 in B");
	}
}

public class Test5 {
	public static void main(String[] args) {
		A a = new B();
		
		
		B b = new B();
		b.m4();
		
		
		A a1= new A();

	}

}
