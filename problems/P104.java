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
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public int depth(TreeNode node){
        if(node == null) return 0;
        else return Math.max(depth(node.left),depth(node.right))+1;

    }
}