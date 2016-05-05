package com.leetcode.solution.s0001_0010;

// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
public class S0001_TwoSum {

	public static void main(String[] args) {
		S0001_TwoSum s = new S0001_TwoSum();
		int[] nums = { -3, 4, 3, 90 };
		int target = 0;
		int[] returns = s.twoSum(nums, target);
		if (returns != null)
			for (int i = 0; i < returns.length; i++) {
				System.out.println(returns[i]);
			}
	}

	public int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		int i = 0, j;
		for (; i < len; i++) {
			j = i + 1;
			for (; j < len; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
