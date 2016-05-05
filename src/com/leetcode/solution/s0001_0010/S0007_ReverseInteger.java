package com.leetcode.solution.s0001_0010;

//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321 

public class S0007_ReverseInteger {

	public static void main(String[] args) {
		S0007_ReverseInteger t = new S0007_ReverseInteger();

		System.out.println(t.reverse(123));
		System.out.println(t.reverse(-123));
		System.out.println(t.reverse(1534236469));

	}

	public int reverse(int x) {
		int tmp = x < 0 ? x * -1 : x;
		try {
			tmp = Integer.parseInt(new StringBuilder("" + tmp).reverse()
					.toString());
			return x < 0 ? tmp * -1 : tmp;
		} catch (Exception e) {
			return 0;
		}
	}
}
