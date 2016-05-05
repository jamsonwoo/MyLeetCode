package com.leetcode.solution.s0001_0010;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Given a string, find the length of the longest substring without
// repeating characters.
// Examples:
// Given "abcabcbb", the answer is "abc", which the length is 3.
// Given "bbbbb", the answer is "b", with the length of 1.
// Given "pwwkew", the answer is "wke", with the length of 3. Note that the
// answer must be a substring, "pwke" is a subsequence and not a substring.
public class S0003_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		S0003_LongestSubstringWithoutRepeatingCharacters t = new S0003_LongestSubstringWithoutRepeatingCharacters();
		String s = "abcabcbb";
		System.out.println(t.lengthOfLongestSubstring(s));
		s = "bbbbb";
		System.out.println(t.lengthOfLongestSubstring(s));
		s = "pwwkew";
		System.out.println(t.lengthOfLongestSubstring(s));
		s = "dvdf";
		System.out.println(t.lengthOfLongestSubstring(s));
	}

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		Queue<Character> tmp = new LinkedBlockingQueue<Character>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (!tmp.contains(c)) {
				tmp.add(c);
			} else {
				if (tmp.size() > max)
					max = tmp.size();
				for (char d : tmp) {
					tmp.poll();
					if (d == c)
						break;
				}
				tmp.add(c);
			}
		}
		if (tmp != null) {
			if (tmp.size() > max)
				max = tmp.size();
		}
		return max;
	}
}
