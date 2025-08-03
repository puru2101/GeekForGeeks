package com.p1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
		if (instance != null) {
			throw new IllegalStateException("Singleton already initialized!");
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) throws Exception {
		Singleton s2 = Singleton.getInstance();
		Constructor<Singleton> cons = Singleton.class.getDeclaredConstructor();
		cons.setAccessible(true);
		Singleton s1 = cons.newInstance();

	
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
