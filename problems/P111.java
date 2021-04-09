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
    public int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        checkDepth(root, 1);
        return min;
    }

    public void checkDepth(TreeNode node,int depth) {
        if(node.left == null && node.right == null){
            if(depth < min) min = depth;
        }
        if(node.left != null) checkDepth(node.left,depth+1);
        if(node.right != null) checkDepth(node.right,depth+1);
    }
}