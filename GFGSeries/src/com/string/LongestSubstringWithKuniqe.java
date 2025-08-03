package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKuniqe {

	public static int substring(String str) {
		int start = 0;
		int maxlength = 0;
		Map<Character, Integer> mp = new HashMap<>();
		for (int curr = 0; curr < str.length(); curr++) {
			Character charCurr = str.charAt(curr);
			mp.put(charCurr, mp.getOrDefault(charCurr, 0) + 1);

			while (mp.size() > 2) {
				Character charStart = str.charAt(start);
				mp.put(charStart, mp.get(charStart) - 1);
				if (mp.get(charStart) == 0) {
					mp.remove(charStart);
				}
				start++;
			}
			maxlength = Math.max(maxlength, curr - start + 1);
		}
		return maxlength;
	}

	public static void main(String[] args) {
		String s = "aaede";
		System.out.println(substring(s));
		//substring(s);
	}

}
