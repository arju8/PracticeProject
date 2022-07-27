 package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {
	public static void main(String[] args) {
		String s="functional testing manual testing api testing ready api";
		Map<String, Integer> m=new HashMap<>();//our output need to be in key value so we need to declare a map

		String[] allWords = s.split(" ");//split all the words and stored in a string of array


		for (String word : allWords) {//we need to iterate all the words one by one
			if (m.containsKey(word)) {//we need to check if map has the word with contains key
				Integer value = m.get(word);//get key with get method
				m.put(word, value+1);//if word repeats more than 1 time wen need to increment

			}else
			{
				m.put(word, 1);
			}

		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();// we need to convert the map to set to get a specific entry
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}

		}
	}

}
