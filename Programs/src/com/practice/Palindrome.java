package com.practice;

public class Palindrome {

	public static void palindrome1() {
		int a,n,i=0,j=0;
		n=12345;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("the palindrome of given number is"+j);
	}

	public static void palindromeForRange() {
		int count=0;
		for(int n=1;n<=1000;n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j) {
				System.out.println(j+" ");
				count++;
			}
		}
		System.out.println("the number of palindrome numbers int the given range"+count);


	}

	public static void palindromeOfaWord() {
		String s="arjunan";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);

		}
		System.out.println(reverse);

	}

	public static void palindromeOfAString() {
		String s="Welcome To Java";
		String reverseStr="";

		String[] allWords = s.split(" ");
		for (String word : allWords) {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--) {

				reverse=reverse+word.charAt(i);
			}
			reverseStr=reverseStr+reverse+" ";

		}
		System.out.println(reverseStr);

	}
	public static void main(String[] args) {
		palindrome1();
		//palindromeForRange();
		palindromeOfaWord();
		palindromeOfAString();
	}
}
