package com.practice;

public class PrimeTask {
	public static void main(String[] args) {
		for(int n=2;n<1000;n++) {
			int c=0;// c starts from zero every time so when n=10 c is 0
			for(int i=2;i<n;i++) {

				if(n%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(n);
			}
		}
	}
}


