package com.leetcode.solution.s0001_0010;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.

public class S0005_LongestPalindromicSubstring {

	public static void main(String[] args) {
		S0005_LongestPalindromicSubstring t = new S0005_LongestPalindromicSubstring();
		String s = "a";
		System.out.println(t.longestPalindrome(s));
		s = "iopsajhffgvrnyitusobwcxgwlwniqchfnssqttdrnqqcsrigjsxkzcmuoiyxzerakhmexuyeuhjfobrmkoqdljrlojjjysfdslyvckxhuleagmxnzvikfitmkfhevfesnwltekstsueefbrddxrmxokpaxsenwlgytdaexgfwtneurhxvjvpsliepgvspdchmhggybwupiqaqlhjjrildjuewkdxbcpsbjtsevkppvgilrlspejqvzpfeorjmrbdppovvpzxcytscycgwsbnmspihzldjdgilnrlmhaswqaqbecmaocesnpqaotamwofyyfsbmxidowusogmylhlhxftnrmhtnnljjhhcfvywsqimqxqobfsageysonuoagmmviozeouutsiecitrmkypwknorjjiaasxfhsftypspwhvqovmwkjuehujofiabznpipidhfxpoustquzyfurkcgmioxacleqdxgrxbldcuxzgbcazgfismcgmgtjuwchymkzoiqhzaqrtiykdkydgvuaqkllbsactntexcybbjaxlfhyvbxieelstduqzfkoceqzgncvexklahxjnvtyqcjtbfanzgpdmucjlqpiolklmjxnscjcyiybdkgitxnuvtmoypcdldrvalxcxalpwumfx";
		System.out.println(t.longestPalindrome(s));
		s = "bb";
		System.out.println(t.longestPalindrome(s));

	}

	// public String longestPalindrome(String s) {
	// int len = s.length();
	// for (int i = len; i > 0; i--) {
	// for (int j = 0; j < s.length(); j++) {
	// if (i + j > len)
	// break;
	// String sub = s.substring(j, i + j);
	// if (isPalindrome(sub)) {
	// return sub;
	// }
	// }
	// }
	// return "";
	// }
	//
	// public boolean isPalindrome(String x) {
	// // return x.equals(new StringBuffer(x).reverse().toString());
	// int i = 0, j = x.length() - 1;
	// while (i < j) {
	// if (x.charAt(i++) != x.charAt(j--))
	// return false;
	// }
	// return true;
	// }
	public String longestPalindrome(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}

}
