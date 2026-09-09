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
    List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null){
            helper(root,"");
        }
        return res;
    }
    void helper(TreeNode root,String curr){
        if(root.left==null && root.right==null){
            res.add(curr+root.val);
        }

        if(root.left!=null){
            helper(root.left,curr+root.val+"->");
        }
        if(root.right!=null){
            helper(root.right,curr+root.val+"->");
        }
    }
}