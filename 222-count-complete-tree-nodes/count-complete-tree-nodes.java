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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=find(root.left);
        int right=find(root.right);
        if(left==right){
            return (1<<left)+countNodes(root.right);
        }else{
            return(1<<right)+countNodes(root.left);
        }

    }
    int find(TreeNode root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
}