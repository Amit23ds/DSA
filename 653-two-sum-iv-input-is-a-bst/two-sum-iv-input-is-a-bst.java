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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> temp=new ArrayList<>();
        inorder(root,temp);
        int l=0, r=temp.size()-1;
        while(l<r){
            int sum=temp.get(l)+temp.get(r);
            if(sum==k){
                return true;
            }
            if(sum>k){
                r--;
            }else{
                l++;
            }
        } 
        return false;
    }
    void inorder(TreeNode root,ArrayList<Integer> temp){
        if(root==null) return;
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);
    }
}