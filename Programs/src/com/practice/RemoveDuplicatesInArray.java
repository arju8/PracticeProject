package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		
	
	Integer [] a= {1,2,3,2,1};
	List<Integer> l=Arrays.asList(a);
	Set<Integer> s=new HashSet<>(l);
	System.out.println(s);
	}
	
	
	

}
