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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

         int carry = 0,
         int sum;

        ListNode head = new ListNode(0);

        ListNode node1 = l1;

ListNode node2 = l2;

        ListNode node = head;

        

        while (carry != 0 || node1 != null || node2 != null) {

            sum = carry;

            

            if (node1 != null) {

                sum += node1.val;

                node1 = node1.next;

            }

            if (node2 != null) {

                sum += node2.val;

                node2 = node2.next;

            }

            

            carry = sum / 10;

            node.next = new ListNode(sum % 10);

            node = node.next; 

        }

        return head.next;  

        

    }

}
