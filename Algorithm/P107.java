import java.util.*;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        List<TreeNode> treeNodeList = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        // int l = 0;
        treeNodeList.add(root);
        level.add(0);
        int index = 0;
        while(index < treeNodeList.size()){
            TreeNode t = treeNodeList.get(index);
            if(t.left != null){
                treeNodeList.add(t.left);
                level.add(level.get(index)+1);
            }
            if(t.right != null){
                treeNodeList.add(t.right);
                level.add(level.get(index)+1);
            }
            index++;
        }
        int k = -1;
        index = 0;
        while(index<level.size()){
            int t = level.get(index);
            if(t > k){
                k = t;
                List<Integer> temp = new ArrayList<>();
                while(index<level.size() && level.get(index) == k){
                    temp.add(treeNodeList.get(index).val);
                    index++;
                }
                list.push(temp);
            }
        }
        return list;
    }
}