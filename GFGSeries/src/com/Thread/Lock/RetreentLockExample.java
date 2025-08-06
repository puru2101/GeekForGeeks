package com.Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantLock.*;
public class RetreentLockExample {

   private final Lock l1 = new ReentrantLock();	
	
   
    void outer() {
	   l1.lock();
	   System.out.println("outer begin ");
	   inner();
	   l1.unlock();
	   System.out.println("outer end ");
   }
   
    void inner() {
 	   l1.lock();
 	   System.out.println("inner begin ");
 	   l1.unlock();
 	   System.out.println("inner end ");
    }
	
	public static void main(String[] args) {
		RetreentLockExample r1= new RetreentLockExample();
		r1.outer();
		

	}

}
