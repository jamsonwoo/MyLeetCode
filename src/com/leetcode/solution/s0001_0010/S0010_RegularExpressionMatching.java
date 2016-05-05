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
//isMatch("aa","a") �� false
//isMatch("aa","aa") �� true
//isMatch("aaa","aa") �� false
//isMatch("aa", "a*") �� true
//isMatch("aa", ".*") �� true
//isMatch("ab", ".*") �� true
//isMatch("aab", "c*a*b") �� true

public class S0010_RegularExpressionMatching {

	public static void main(String[] args) {
		S0010_RegularExpressionMatching t = new S0010_RegularExpressionMatching();
		System.out.println(t.isMatch("aa", "a"));// false
		System.out.println(t.isMatch("aa", "aa"));// true
		System.out.println(t.isMatch("aaa", "aa"));// false
		System.out.println(t.isMatch("aa", "a*"));// true
		System.out.println(t.isMatch("aa", ".*"));// true
		System.out.println(t.isMatch("ab", ".*"));// true
		System.out.println(t.isMatch("aab", "c*a*b"));// �� true
	}

	public boolean isMatch(String s, String p) {
		try {
			return java.util.regex.Pattern.compile(p).matcher(s).matches();
		} catch (Exception e) {
		}
		return false;
	}

}
