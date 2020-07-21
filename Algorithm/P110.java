import java.util.ArrayList;
import java.util.LinkedList;


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
  
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(list.size()>0){
            TreeNode node = list.pop();
            int t = checkDepth(node.left) - checkDepth(node.right);
            if(t<0) t *= -1;
            if(t>1) return false;
            if(node.left != null) list.add(node.left);
            if(node.right != null) list.add(node.right);
        }
        return true;
    }

    public int checkDepth(TreeNode node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        return Math.max(checkDepth(node.left), checkDepth(node.right)) + 1;
    }

}