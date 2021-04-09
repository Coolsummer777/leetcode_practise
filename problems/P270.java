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
    public int closestValue(TreeNode root, double target) {
        int num = root.val;
        double min = Math.abs(num - target);
        TreeNode temp = root;
        while(temp != null){
            double deta = Math.abs(temp.val - target);
            if(deta < min){
                min = deta;
                num = temp.val;
            }
            if(temp.val > target && temp.left != null){
                temp = temp.left;
            } else if(temp.val < target && temp.right != null){
                temp = temp.right;
            }else{
                break;
            }
        }
        return num;
    }
}