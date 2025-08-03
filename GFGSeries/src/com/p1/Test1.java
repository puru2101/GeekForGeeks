package com.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employe {
	int id;
	String name;
	String city;
	
	Employe(){
	}
	
	Employe(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
}


public class Test1 {

	public static void main(String[] args) {
	
		Employe e1= new Employe(1,"puru1","haridwar1");
		Employe e2= new Employe(1,"puru2","haridwar2");		
		Employe e3= new Employe(1,"puru3","haridwar3");

		List<Employe> el1= Arrays.asList(e1,e2,e3);
		
	Map<Integer,Employe> hm1= new HashMap<>();
	for(Employe e:el1) {
		hm1.put(e.getId(), e);
	}
	
	for(Entry<Integer, Employe> h1:hm1.entrySet()) {
		System.out.println(h1);
		
	}
	
		
	}

}
