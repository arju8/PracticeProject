package com.practice;

public class PrimeNumbers {
	public static void checkPrime() {
		int n=8;

		boolean flag=true;
		for(int i=2;i<n;i++) {

			if(n%i==0) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("notprime");
		}
	}
	public static void checkPrimeRange() {
		int noOfPrime=0;
		for(int n=2;n<1000;n++) {
			boolean flag=true;
			for(int i=2;i<n;i++) {

				if(n%i==0) {
					flag=false;
				}
			}
			if(flag==true) {
				System.out.println(n);
				noOfPrime++;
			}
		}
		System.out.println("no of prime"+noOfPrime);
	}
	public static void main(String[] args) {
		//checkPrime();
		checkPrimeRange();
	}

}
