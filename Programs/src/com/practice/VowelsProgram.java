package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelsProgram {
	public static void vowelsCount() {
		String s="welcome to java class";

		int vowel=0;
		int nonVowel=0;

		Map<Character, Integer> vowelMap=new HashMap<>();
		Map <Character, Integer> nonVowelMap=new HashMap<>();

		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
				if(vowelMap.get(c)==null) {
					vowelMap.put(c, 1);
				}
				else {
					Integer integer =vowelMap.get(c);
					vowelMap.put(c, integer+1);

				}
				vowel++;

			}
			else {
				if(nonVowelMap.get(c)==null) {
					nonVowelMap.put(c, 1);
				}
				else {
					Integer value=nonVowelMap.get(c);
					nonVowelMap.put(c, value+1);
				}
				nonVowel++;
			}
		}
		System.out.println("=========vowels and counts=========");
		System.out.println(vowelMap);
		System.out.println("No of vowels in the above sentence:"+" "+vowel);

		Set<Entry<Character, Integer>> entrySet = vowelMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" ="+value);
		}
		System.out.println("================non vowels and count==============");
		System.out.println(nonVowelMap);
		System.out.println("No of non vowels in the above sentence:"+" "+nonVowel);

		Set<Entry<Character, Integer>> entrySet2 = nonVowelMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet2) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" ="+value);
		}

	}

	public static void main(String[] args) {
		vowelsCount();
	}
}
