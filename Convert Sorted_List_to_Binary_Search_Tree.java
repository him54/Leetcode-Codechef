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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private ListNode curr;
    private TreeNode buildBST(int low, int high) {
        if (low > high) 
        {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode left = buildBST(low, mid - 1);
        TreeNode node = new TreeNode(curr.val);
        curr = curr.next;
        TreeNode right = buildBST(mid + 1, high);
        node.left = left;
        node.right = right;
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int size = getSize(head);
        curr = head;
        return buildBST(0, size - 1);
    }
    
    private int getSize(ListNode head) {
        int size = 0;
        while (head != null)
         {
            size++;
            head = head.next;
        }
        return size;
    }
}
