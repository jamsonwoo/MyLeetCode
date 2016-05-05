package com.leetcode.solution.s0001_0010;

//Implement atoi to convert a string to an integer.
//
//Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
//
//Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

//"+"
//"  -3"
//"     -12312"
//"     -000012312"
//"    -12312adfad   "
//"    -12312adfad34234   "
//"1234567890123456789012345678901234567890"
//"-2147483649"	
public class S0008_StringtoInteger {

	public static void main(String[] args) {
		S0008_StringtoInteger t = new S0008_StringtoInteger();
		String s = "-2147483649";
		System.out.println(t.myAtoi(s));
	}

	public int myAtoi(String str) {
		str = str.trim();
		int i = str.length();
		if (i <= 0)
			return 0;
		System.out.println(Integer.MAX_VALUE);
		long re = 0;
		while (i > 0) {
			try {
				re = Long.valueOf(str.substring(0, i--));
				if (re > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				} else if (re < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
				System.out.println(re);
				break;
			} catch (Exception e) {
			}
		}
		return (int) re;
	}
}
