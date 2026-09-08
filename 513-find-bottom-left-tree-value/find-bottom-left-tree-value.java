/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLvl=-1;
    int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root,0);
        return ans;
    }
    void helper(TreeNode root,int lvl){
        if(root==null) return;
        if(lvl>maxLvl){
            maxLvl=lvl;
            ans=root.val;
        }
        helper(root.left,lvl+1);
        helper(root.right,lvl+1);
    }
}