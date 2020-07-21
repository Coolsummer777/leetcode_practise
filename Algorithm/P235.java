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
class Solution1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(list.size()>0){
            TreeNode node = list.pop();
            if(node.val == p.val || node.val == q.val) return node;
            if(contains(node.left, p) && contains(node.left, q)) list.add(node.left);
            else if(contains(node.right, p) && contains(node.right, q)) list.add(node.right);
            else return node;
        }
        return null;

    }

    public boolean contains(TreeNode node, TreeNode target){
        if(node == null) return false;
        if(node.val == target.val) return true;
        return contains(node.left, target) || contains(node.right, target);
    }
}


//以上做法没有利用二叉搜索树的特点

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(list.size()>0){
            TreeNode node = list.pop();
            if(node.val == p.val || node.val == q.val) return node;
            if(node.val > p.val && node.val > q.val) list.add(node.left);
            else if(node.val < p.val && node.val < q.val) list.add(node.right);
            else return node;
        }
        return null;
    }
}