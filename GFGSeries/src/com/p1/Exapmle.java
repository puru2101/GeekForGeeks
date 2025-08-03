package com.p1;

public class Exapmle{

	void m1() {
		System.out.println("m1 method");
	}
	
	void m2() {
		System.out.println("m2 method");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	
		Runnable rn1= ()->{
		 for (int i = 0; i < 5; i++) {
             System.out.println("Thread t1");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {		
				e.printStackTrace();
			}			
		}
		};
		
		Thread t1= new Thread(rn1);
		t1.start();
		

		Runnable rn2= ()->{
		 for (int i = 0; i < 5; i++) {
             System.out.println("Thread t1");
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		};
		
		Thread t2= new Thread(rn2);
		t1.start();
		
		
		
		
		
		
	}
	
	
}
