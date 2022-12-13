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
    int max = 0;
    public int widthOfBinaryTree(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        travel(root, hm, 0, 0);
        return max;
    }
    
    private void travel(TreeNode root, Map<Integer, Integer>hm, int depth, int id) {
        if(root == null)
        {
            return;
        }
        travel(root.left, hm, depth + 1, id * 2);
        travel(root.right, hm, depth + 1, id * 2 + 1);
        
        if(!hm.containsKey(depth))
        {
            hm.put(depth, id);
        }
        
        max = Math.max(max, id - hm.get(depth) + 1);
        System.out.println("depth " + depth + " id " + id + " max " + max);
    }
}
