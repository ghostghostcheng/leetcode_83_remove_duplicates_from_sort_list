package leetcode_83_remove_duplicates_from_sort_list;

/*
 	Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
 */

public class Question {
	public static void main(String args[]) {
		ListNode l1 = new ListNode(0);
		ListNode resultList = new ListNode(0);
		
		//test data
		l1.next = new ListNode(0);
		l1.next.next = new ListNode(0);
		l1.next.next.next = new ListNode(0);
		l1.next.next.next.next = new ListNode(0);
		l1.next.next.next.next.next = new ListNode(1);
		l1.next.next.next.next.next.next = new ListNode(1);
		//l1.next.next.next.next.next.next.next = new ListNode(5);
		
		
		resultList = Solution.deleteDuplicates(l1.next);
		
		while(resultList != null) {
			System.out.print(resultList.val);
			resultList = resultList.next;
		}
	}
}