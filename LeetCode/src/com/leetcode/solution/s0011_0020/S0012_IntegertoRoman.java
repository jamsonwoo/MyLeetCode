package com.leetcode.solution.s0011_0020;

//Given an integer, convert it to a roman numeral. 
//
//Input is guaranteed to be within the range from 1 to 3999.

//1
//6
//26
//456
//1234
//3785

public class S0012_IntegertoRoman {

	public static void main(String[] args) {
		S0012_IntegertoRoman t = new S0012_IntegertoRoman();
		int num = 6;
		System.out.println(t.intToRoman(num));
		num = 26;
		System.out.println(t.intToRoman(num));
		num = 456;
		System.out.println(t.intToRoman(num));
		num = 1234;
		System.out.println(t.intToRoman(num));
		num = 3785;
		System.out.println(t.intToRoman(num));
	}

	public String intToRoman(int num) {
		String[][] roman = {
				{ "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
				{ "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
				{ "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
				{ "", "M", "MM", "MMM" } };

		String ret = "";
		int digit = 0;
		while (num != 0) {
			int remain = num % 10;
			ret = roman[digit][remain] + ret;
			digit++;
			num /= 10;
		}

		return ret;
	}
}
