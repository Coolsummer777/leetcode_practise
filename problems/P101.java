import java.util.ArrayList;
import java.util.List;

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode a,TreeNode b){
        if(a == null && b == null) return true;
        if(a != null && b == null) return false;
        if(a == null && b != null) return false;
        if(a.val != b.val) return false;

        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}