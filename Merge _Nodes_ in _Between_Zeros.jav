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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode Head = new ListNode(-1); // dummy node
        ListNode node1 = Head;
        ListNode node2 = head;
        while(node2 != null)
        {
            node2 = node2.next;
            int sum = 0;
            while(node2 != null && node2.val != 0)
            {
                sum += node2.val;
                node2 = node2.next;
            }
            if(sum != 0)
            {
                node1.next = new ListNode(sum);
                node1 = node1.next;
            }
        }
        return Head.next;
        
    }
}
