package org.ListSample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.m;

public class A {
       
	public List<Integer> test() {

		List<Integer>li = new ArrayList<Integer>();
		
	li.add(10);
	li.add(20);
	li.add(45);
	li.add(50);
	li.add(70);
	
	
	
	Set<Integer> s = new LinkedHashSet<Integer>();
	s.addAll(li);
	return li;
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
