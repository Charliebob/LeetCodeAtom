// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode head = dummy;
      while(l1!=null && l2!=null){
        if(l1.val>=l2.val){
          dummy.next = l2;
          l2 = l2.next;
        }else{
          dummy.next = l1;
          l1 = l1.next;
        }
        dummy = dummy.next;
      }
      dummy.next = (l1!=null)? l1:l2;
      return head.next;
    }
  }
