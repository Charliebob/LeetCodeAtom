// Remove all elements from a linked list of integers that have value val.
//
// Example
// Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
// Return: 1 --> 2 --> 3 --> 4 --> 5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
      while(head!=null && head.val==val) head = head.next;
      if(head==null) return head;
      ListNode dummy = head;
      while(dummy.next!=null){
        if(dummy.next.val==val){
          dummy.next = dummy.next.next;
        }else{
          dummy = dummy.next;
        }
      }
      return head;
    }
  }
