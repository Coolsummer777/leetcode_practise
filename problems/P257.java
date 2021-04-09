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
    public List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return list;
        findRoute(root, "");
        return list;
    }

    public void findRoute(TreeNode node,String s){
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(s);
        sBuilder.append(Integer.toString(node.val));
        if(node.left != null || node.right != null) 
            sBuilder.append("->");
        if(node.left != null){
            findRoute(node.left, sBuilder.toString());
        }
        if(node.right != null){
            findRoute(node.right, sBuilder.toString());
        }
        if(node.left == null && node.right == null) 
            list.add(sBuilder.toString());
    }
}