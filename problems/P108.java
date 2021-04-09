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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }

    public TreeNode buildTree(int[] nums,int start,int end){
        if(nums.length == 0) return null;
        if(start == end) return new TreeNode(nums[start]);
        else{
            int t = (start + end) / 2;
            TreeNode node = new TreeNode(nums[t]);
            if(t == start) node.left = null;
            else node.left = buildTree(nums, start, t-1);
            if(t == end) node.right = null;
            else node.right = buildTree(nums, t+1, end);
            return node;
        }
    }
}