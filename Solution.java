package leetcode_83_remove_duplicates_from_sort_list;

public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null|| head.next == null) {
            return head;
        }
        
        ListNode resultNode = new ListNode(0);
        ListNode resultTmpNode = resultNode;
        ListNode nowNode = head;

        resultTmpNode.next = new ListNode(head.val);
        resultTmpNode = resultTmpNode.next;
        
        while (nowNode != null) {
            if (resultTmpNode.val != nowNode.val) {
            	resultTmpNode.next = new ListNode(nowNode.val);
            	resultTmpNode = resultTmpNode.next;
            }
            nowNode = nowNode.next;
        }
       
        return resultNode.next;
    }
}