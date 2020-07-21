/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        checkDepth(root);
        return max;
    }
    public int checkDepth(TreeNode node){
        if(node == null) return 0;
        int l = checkDepth(node.left);
        int r = checkDepth(node.right);
        if(l+r>max) max = l+r;
        return 1+Math.max(l, r);
    }
}