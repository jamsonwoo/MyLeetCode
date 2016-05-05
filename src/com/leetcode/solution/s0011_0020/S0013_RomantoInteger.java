package com.leetcode.solution.s0011_0020;

//Given a roman numeral, convert it to an integer.
//
//Input is guaranteed to be within the range from 1 to 3999.

public class S0013_RomantoInteger {

	public static void main(String[] args) {
		S0013_RomantoInteger t = new S0013_RomantoInteger();
		String s = "VI";
		System.out.println(t.romanToInt(s));
		s = "XXVI";
		System.out.println(t.romanToInt(s));
		s = "CDLVI";
		System.out.println(t.romanToInt(s));
		s = "MCCXXXIV";
		System.out.println(t.romanToInt(s));
		s = "MMMDCCLXXXV";
		System.out.println(t.romanToInt(s));
		s="DCXXI";
		System.out.println(t.romanToInt(s));
		
	}

	public int romanToInt(String s) {
		int ret = toNumber(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (toNumber(s.charAt(i - 1)) < toNumber(s.charAt(i))) {
				ret += toNumber(s.charAt(i)) - 2 * toNumber(s.charAt(i - 1));
			} else {
				ret += toNumber(s.charAt(i));
			}
		}
		return ret;
	}

	int toNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

}
