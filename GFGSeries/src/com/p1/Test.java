package com.p1;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Test implements Serializable{
	private static final long serialVersionUID = 1L;
	
	

	

	
//	
//	
//	
//	
//	int a;
//	 int b;
//	 int c;
//
//		 Test() {
//			super();
//		}
//
//	Test(int ar,int br){
//		this.a=ar;
//		this.b=br;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Test [a=" + a + ", b=" + b + "]";
//	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		List<Integer> ls= new ArrayList<>(Arrays.asList(1,2,4));
		 Integer sum= ls.stream().map(e->e*e).mapToInt(Integer::intValue).sum();	
		System.out.println(sum);
		
	
		
		System.out.println(IntStream.of(1,2).map(e->e*e).sum());
		
		
		
		
		
//		Test t=new Test(5,4);
//		
//		
//		
//		
//		/*
//		 * FileOutputStream fs= new FileOutputStream("abcd.txt"); ObjectOutputStream os=
//		 * new ObjectOutputStream(fs); os.writeObject(t); System.out.println("comp");
//		 * t.a=10; System.out.println(t.a);
//		 */
//		 
//		 
//		 
//		
//		
//			
//			
//		
//		  FileInputStream fs1= new FileInputStream("abcd.txt"); ObjectInputStream os1=
//		  new ObjectInputStream(fs1); System.out.println(os1.readObject());
//		 
	
		
		
		
//		Test t = new Test();
//		t.start();
//			
//    		  List<Integer> list = Arrays.asList(2, 3, 57, 5, 43, 2, 6, 1,3,57,43);
    		
//           Set<Integer> dupli=new HashSet<>();
//           String s1="0HIiamusingjava8";
           
//		   list.stream().filter(e->e%2==0).collect(Collectors.toList()).forEach(System.out::println);
//		   System.out.println("-------------------");
//		   list.stream().filter(e->e%2!=0).collect(Collectors.toList()).forEach(System.out::println);
		   
//		  list.stream().filter(e->!dupli.add(e)).collect(Collectors.toSet()).forEach(System.out::println);

//           Map<Integer, Long> freq= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//           freq.entrySet().stream().forEach(System.out::println);
           
//          Map<Character,Long> hm= s1.chars().mapToObj(e-> (char) e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//          
//          hm.entrySet().stream().forEach(System.out::println);
//          System.out.println("-------------------");
//          s1.chars().asLongStream().forEach(System.out::println);
		
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
         
    		 // list.stream().sorted().forEach(System.out::println);  
    		  
    		 // list.stream().filter(e->e%5==0).forEach(System.out::println);
    		  
//    		Integer hm=list.stream().max(Comparator.naturalOrder()).get();
//    		  System.out.println(hm);
//    		  
//    		  Integer hm1=list.stream().min(Comparator.naturalOrder()).get();
//    		  System.out.println(hm1);
////    		  
//    		  int[] a1= {1,4,3,6,2,0};
//    		  int[] a2= {9,7,55,8,4,6};
//    		  
//    		  IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().distinct().forEach(System.out::println);
    		  
//    		  
//    		  String s1="listen";
//    		  String s2="litnes";
//    		  
//    		  String s3=Stream.of(s1.split("")).sorted().collect(Collectors.joining());
//    		  System.out.println(s3);
//    		  String s4=Stream.of(s2.split("")).sorted().collect(Collectors.joining());
//    		  System.out.println(s4);
//    		  System.out.println(s3.equals(s4));
//    		
//    		  

//    		  int a=23456;
//    		  
//    		 Integer a1= Stream.of(String.valueOf(a).split("")).collect(Collectors.summingInt(Integer::parseInt));
//    		  System.out.println(a1);
    		  
    		  
   		 // List<Integer> list1 = Arrays.asList(2, 3, 57, 5, 43, 2, 6, 1,3,57,43);
//    		  list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);
//    		
//    		  int ar[]= {1,4,7,3,2,87,9};
    		  
//    		  Runnable rn= new Runnable() {
//				
//				@Override
//				public void run() {
//					for(int i=0;i<5;i++) {
//						System.out.println("hello");
//						try {
//							Thread.sleep(500);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//					
//				}
//			}; 
//    		  Thread t= new Thread(rn);
//    		  t.start();
//    		  
    		  
    		  
    		  
    		  
	}






	List<Integer> ls= new ArrayList<>(Arrays.asList(1,2,4,5,6,7));




	
	
	

}
