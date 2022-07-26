package com.practice;

public class Replace {
	public static void main(String[] args) {
		String str="this@is#a^&String*";
		String replaceAll = str.replaceAll("[^A-Za-z0-9]"," " );
		System.out.println(replaceAll);
		
	}

}
