package com.leetcode.solution.s0001_0010;

//Determine whether an integer is a palindrome. Do this without extra space.
//
//-2147483648
//-2147447412
public class S0009_PalindromeNumber {

	public static void main(String[] args) {
		S0009_PalindromeNumber t = new S0009_PalindromeNumber();
		int[] x = { -2147447412 };// 0, -1, Integer.MIN_VALUE,
									// Integer.MAX_VALUE, 123, 12321, 12344321,-2147483648,	-2147447412
		for (int i = 0; i < x.length; i++) {
			// t.isPalindrome(x[i]);
			System.out.println(x[i] + " " + t.isPalindrome(x[i]));
		}
	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int tmp = x;
		int re = 0, a;
		while (tmp != 0) {
			a = tmp % 10;
			re = re * 10 + a;
			tmp = tmp / 10;
			System.out.println(re);
		}
		System.out.println(x);
		return x == re;
	}
}
