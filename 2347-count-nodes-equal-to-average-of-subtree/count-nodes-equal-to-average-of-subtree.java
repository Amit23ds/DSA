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
    int cnt=0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return cnt;
    }
    int[] helper(TreeNode root){
        if(root==null) return new int[]{0,0};

        int[] l=helper(root.left);
        int[] r=helper(root.right);

        int sum=l[0]+r[0]+root.val;
        int n=l[1]+r[1]+1;

        if(sum/n==root.val){
            cnt++;
        }
        return new int[]{sum,n};
    }
}