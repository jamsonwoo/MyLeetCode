package com.leetcode.solution.s0011_0020;

import java.util.HashMap;
import java.util.Map;

//Write a function to find the longest common prefix string amongst an array of strings. 
//[]
//["","a","ab"]
//["a","aa","ab"]

public class S0014_LongestCommonPrefix {

	public static void main(String[] args) {
		S0014_LongestCommonPrefix t = new S0014_LongestCommonPrefix();
		String[] strs = { "aabd", "aab", "aab" };
		System.out.println(t.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		int index = 0;
		String begin = strs[0];
		for (int i = 0; i < begin.length(); i++) {
			for (int j = 1; j < strs.length; j++) {
				if (i >= strs[j].length()
						|| begin.charAt(i) != strs[j].charAt(i)) {
					return begin.substring(0, index);
				}
			}
			index++;
		}
		return begin.substring(0, index);
	}
}
