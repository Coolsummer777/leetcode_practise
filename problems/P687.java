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
    public int longestUnivaluePath(TreeNode root) {
        method(root);
        return max;
    }
    public int method(TreeNode node){
        if(node == null) return 0;
        int ans = 0;
        int l = method(node.left);
        int r = method(node.right);
        int t = 0;
        if(l>0 && node.val==node.left.val) {
            ans = l;
            t += l;
        }
        if(r>0 && node.right.val==node.val) {
            t += r;
            if(r>ans)
                ans = r;
        }
        if(t>max) max = t;
        return ans+1;
    }
}