package com.leetcode.solution.s0001_0010;

import java.util.Arrays;

//There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class S0004_MedianofTwoSortedArrays {

	public static void main(String[] args) {
		S0004_MedianofTwoSortedArrays t = new S0004_MedianofTwoSortedArrays();

		int[] nums1 = { 0, 2, 3 };
		int[] nums2 = { 1, 14 };
		System.out.println(t.findMedianSortedArrays(nums1, nums2));

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] a = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, a, 0, nums1.length);
		System.arraycopy(nums2, 0, a, nums1.length, nums2.length);
		Arrays.sort(a);
		print(a);
		double median = 0;

		double m = (double) a.length / 2;
		int flag = a.length % 2;
		// Å¼Êý
		if (flag == 0) {
			median = (double) (a[(int) m] + a[(int) m - 1]) / 2;
		} else {
			// ÆæÊý
			median = a[(int) (m)];
		}
		return median;
	}

	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

}
