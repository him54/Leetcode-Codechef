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
      int length = 0;
      ListNode Node;
    public Solution(ListNode head) {
      Node = head;
      ListNode temp = Node;
      while(temp != null)
      {
          length++;
          temp = temp.next;
      }
        
    }
    
    public int getRandom() {
        Random random = new Random();
        int idx = random.nextInt(length);
        ListNode temp = Node;
        for(int i = 0; i<idx; i++)
        {
            temp = temp.next;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
