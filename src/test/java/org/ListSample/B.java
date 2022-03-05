package org.ListSample;

import java.util.List;

public class B extends A {

	public static void main(String[] args) {
		
		B b = new B();
		
		List<Integer> test = b.test();
		
		for (Integer x : test) {
			
			if (x.equals(10)) {
				System.out.println("valid");
				
			} else {
System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
