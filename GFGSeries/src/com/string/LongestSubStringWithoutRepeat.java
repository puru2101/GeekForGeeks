package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeat {

	public static int subString(String str) {
		int start = 0;
		int max = 0;
		Map<Character, Integer> mp = new HashMap<>();

		for (int curr = 0; curr < str.length(); curr++) {
			char charAt=str.charAt(curr);
			if (mp.containsKey(charAt) && mp.get(charAt) >= start) {
				start = mp.get(charAt) + 1;
				
			
			}
			mp.put(charAt, curr);
			max = Math.max(max, curr - start + 1);
		}

		return max;

	}

	public static void main(String[] args) {
		String s = "abcaffbcdebb";
		System.out.println(subString(s));
	}

}
