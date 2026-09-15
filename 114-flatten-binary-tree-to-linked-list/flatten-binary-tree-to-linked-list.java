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
    void helper(TreeNode root,List<TreeNode> res){
        for(int i=1;i<res.size();i++){
            root.right=res.get(i);
            root.left=null;
            root=root.right;
        }
    }
    public void flatten(TreeNode root) {
        List<TreeNode> res=new ArrayList<>();
        preorder(root,res);
        helper(root,res);
    }
    void preorder(TreeNode root,List<TreeNode> res){
        if(root==null){
            return;
        }
        res.add(root);
        preorder(root.left,res);
        preorder(root.right,res);
    }
}