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
    int postIdx;
    HashMap<Integer, Integer> map;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
        {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) 
        {
            return null;
        }
        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);
        int idx = map.get(rootVal);
        root.right = buildTreeHelper(inorder, postorder, idx + 1, inEnd);
        root.left = buildTreeHelper(inorder, postorder, inStart, idx - 1);
        return root;
    }
}
