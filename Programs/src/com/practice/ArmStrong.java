package com.practice;

import java.util.Scanner;

public class ArmStrong {

	public static void armStrong1() {
		int a,n,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		a=n;
		while(a>0) {
			i=a%10;//153%10=3;15%10=5;
			j=j+(i*i*i);
			a/=10;
		}
		if(n==j) {
			System.out.println("the given number is palindrome"+" "+n);
			
		}else {
			System.out.println("the given number is not armstrong");
		}
		

	}
	public static void countAndPrintArmStrong() {
		int c=0;
		for (int n = 1; n <1000; n++) {
			int a,i=0,j=0;
			a=n;
			while(a>0) {
				i=a%10;
				j=j+(i*i*i);
				a/=10;
			}
			if(j==n) {
				System.out.println("armstrong"+n);
				c++;
			}

		}
		System.out.println("count of armstrong"+c);
	}


	public static void main(String[] args) {
		armStrong1();
		//countAndPrintArmStrong();
	}

}
