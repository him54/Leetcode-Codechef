/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
import java.io.*;
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        {
            return null;
        }
        ListNode fast  = head;  
        ListNode slow = head;
        ListNode mid = null;
        
        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            mid = slow;
            slow = slow.next;
        }
        mid.next = mid.next.next;
        
        return head;
    }
}
