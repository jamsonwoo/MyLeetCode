package com.leetcode.solution.s0001_0010;

//Implement regular expression matching with support for '.' and '*'.
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
//
//The matching should cover the entire input string (not partial).
//
//The function prototype should be:
//bool isMatch(const char *s, const char *p)
//
//Some examples:
//isMatch("aa","a") ¡ú false
//isMatch("aa","aa") ¡ú true
//isMatch("aaa","aa") ¡ú false
//isMatch("aa", "a*") ¡ú true
//isMatch("aa", ".*") ¡ú true
//isMatch("ab", ".*") ¡ú true
//isMatch("aab", "c*a*b") ¡ú true

public class S0010_RegularExpressionMatching {

	public static void main(String[] args) {
		S0010_RegularExpressionMatching t = new S0010_RegularExpressionMatching();
		System.out.println(t.isMatch("aa", "a"));// false
		System.out.println(t.isMatch("aa", "aa"));// true
		System.out.println(t.isMatch("aaa", "aa"));// false
		System.out.println(t.isMatch("aa", "a*"));// true
		System.out.println(t.isMatch("aa", ".*"));// true
		System.out.println(t.isMatch("ab", ".*"));// true
		System.out.println(t.isMatch("aab", "c*a*b"));// ¡ú true
	}

	public boolean isMatch(String s, String p) {
		try {
			return java.util.regex.Pattern.compile(p).matcher(s).matches();
		} catch (Exception e) {
		}
		return false;
	}

}
