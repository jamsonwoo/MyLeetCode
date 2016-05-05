package com.leetcode.solution.s0001_0010;


//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility) 
//P   A   H   N
//A P L S I I G
//Y   I   R
//
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows: 
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
public class S0006_ZigZagConversion {

	public static void main(String[] args) {
		S0006_ZigZagConversion t = new S0006_ZigZagConversion();
		int numRows = 8;
		String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(t.convert(s, numRows));
	}

	private StringBuffer[] create(String s, int numRows) {
		char[] arr = s.toCharArray();
		int i = 0;
		StringBuffer[] re = new StringBuffer[numRows];

		for (int k = 0; k < numRows; k++) {
			re[k] = new StringBuffer();
		}
		boolean down = true;
		int row;

		for (char ch : arr) {
			row = i % numRows;
			re[row].append(ch);
			// System.out.print(ch + "(" + i + "," + down + "),");
			if (i == 0)
				down = true;
			else if (i == numRows - 1)
				down = false;
			if (down)
				i++;
			else
				i--;
		}
		return re;
	}

	public String convert(String s, int numRows) {
		StringBuffer[] list = create(s, numRows);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.length; i++) {
			sb.append(list[i].toString());
		}
		return sb.toString();
	}
}
