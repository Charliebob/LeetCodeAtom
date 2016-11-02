// Given a linked list, swap every two adjacent nodes and return its head.
//
// For example,
// Given 1->2->3->4, you should return the list as 2->1->4->3.
//
// Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode cur = dummy;
      ListNode l1 = null, l2 = null;
      while(cur.next!=null && cur.next.next!=null){
        l1 = cur.next;
        l2 = cur.next.next;
        l1.next = l2.next;
        l2.next = l1;
        cur.next = l2;
        cur = l1;
      }
      return dummy.next;
    }
  }
