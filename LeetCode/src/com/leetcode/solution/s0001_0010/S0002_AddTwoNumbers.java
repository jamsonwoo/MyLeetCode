package com.leetcode.solution.s0001_0010;

import java.util.ArrayList;
import java.util.List;

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
public class S0002_AddTwoNumbers {

	public static void main(String[] args) {
		S0002_AddTwoNumbers s = new S0002_AddTwoNumbers();

		ListNode l1 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);
		l1.next = l12;
		l12.next = l13;

		ListNode l2 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l2.next = l22;
		l22.next = l23;

		ListNode l14 = new ListNode(5);
		l13.next = l14;
		ListNode l15 = new ListNode(1);
		l14.next = l15;
		ListNode l24 = new ListNode(5);
		l23.next = l24;

		ListNode re = s.addTwoNumbers(l1, l2);
		while (re != null) {
			System.out.print(re.val);
			if (re.next != null)
				System.out.print(" -> ");
			re = re.next;
		}

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		List<ListNode> tmp = new ArrayList<ListNode>();
		ListNode re = null;
		int c = 0, sum = 0;
		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + c;
			c = sum / 10;
			tmp.add(new ListNode(sum % 10));
			l1 = l1.next;
			l2 = l2.next;
		}
		l1 = l1 != null ? l1 : l2;
		if (l1 != null) {
			while (l1 != null) {
				sum = l1.val + c;
				c = sum / 10;
				tmp.add(new ListNode(sum % 10));
				l1 = l1.next;
			}
		}

		if (tmp != null) {
			re = tmp.get(0);
			for (int j = 0; j < tmp.size(); j++) {
				if (j + 1 < tmp.size())
					tmp.get(j).next = tmp.get(j + 1);
			}
		}
		ListNode cur = re;

		if (c != 0) {
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = new ListNode(c);
		}
		return re;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}