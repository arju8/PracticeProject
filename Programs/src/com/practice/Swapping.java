package com.practice;

public class Swapping {
	public static void swapWithThirdv(){
		int a=1000;
		int b=50;
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+" "+" B="+b);
	}
	
	public static void swapWithOutVariable() {
		
		int a=100;
		int b=97;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a+" "+" B="+b);

	}
	public static void main(String[] args) {
		swapWithOutVariable();
		
		
		
	}

}
