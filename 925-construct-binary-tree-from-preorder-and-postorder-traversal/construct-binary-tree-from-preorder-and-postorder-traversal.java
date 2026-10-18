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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] idx=new int[]{0};
        return helper(preorder,postorder,idx,0,preorder.length-1);
    }
    TreeNode helper(int[] preorder,int[] postorder,int[] idx,int l,int r){
        if(idx[0]>=preorder.length || l>r){
            return null;
        }
        TreeNode root=new TreeNode(preorder[idx[0]++]);
        if(l==r) return root;
        int i;
        for(i=l;i<=r;i++){
            if(postorder[i]==preorder[idx[0]]) break;
        }
        if(l<=r){
            root.left=helper(preorder,postorder,idx,l,i);
            root.right=helper(preorder,postorder,idx,i+1,r-1);
        }
        return root;
    }
}