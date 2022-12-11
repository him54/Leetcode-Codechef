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
    int maxPath=(int)-1e9;
    public int maxPathSum(TreeNode root) {
        val(root);
        return maxPath;
    }
    
    private int val(TreeNode root){
        if(root == null)
        {
            return 0;
        }
        
        int max1 = Math.max(0, val(root.left));
        int max2 = Math.max(0, val(root.right)); 
        maxPath = Math.max(maxPath, max1+max2 + root.val);
        
        return Math.max(max1, max2) + root.val;
    }
}
