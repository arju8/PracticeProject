package com.practice;

public class IntrvwProgram {
	public static void main(String[] args) {
		String s="iyefgyigfeyfgy10wrbhbr100bvhe4";
		
		s = s.replaceAll("\\D", " ");
		System.out.println(s);
		
		s = s.trim();
		System.out.println(s);
		
		s=s.replaceAll(" +", " ");
		System.out.println(s);
		
		
		String [] s1=s.split(" ");
        
		Integer parseIntAdd=0;
		for (int i = 0; i < s1.length; i++) {
		
		System.out.println(s1[i]);
		Integer parseInt=Integer.parseInt(s1[i]);
		parseIntAdd=parseIntAdd+parseInt;
			
		}
		System.out.println("answer:"+parseIntAdd);
		
				
	}

}
