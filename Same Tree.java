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
import java.io.*;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null && q.val == p.val) 
        {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return p == null && q == null;
    }
}
