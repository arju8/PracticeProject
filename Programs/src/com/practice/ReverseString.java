package com.practice;

public class ReverseString {
public static void main(String[] args) {
	String s="welcome to java";
	
	String[] allWords = s.split(" ");
	String reversestc="";
	for (int n = 0; n < allWords.length; n++) {
		String reverse="";
		String word = allWords[n];
		for (int i =word.length()-1; i >=0; i--) {
			char ch = word.charAt(i);
			reverse=reverse+ch;
			
		}
		
		reversestc=reversestc+reverse+" ";
		
	}
	System.out.println(reversestc);
}
}
