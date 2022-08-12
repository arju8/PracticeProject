package com.practice;

public class Array_Pair {
	
	public static void main(String[] args) {
		int arr[]= {1,2,6,4,8,5,9,11};
		int target=12;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("pairs adding upon get target :"+"{"+arr[i]+","+arr[j]+"}");
					System.out.println("index of the pairs:"+"{"+i+","+j+"}");
					
				}
				
			}
			
		}
	}

}
