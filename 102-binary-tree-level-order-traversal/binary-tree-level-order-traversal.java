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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(root,0,ans);
        return ans;
    }
    private void solve(TreeNode root,int lvl,List<List<Integer>> ans){
        if(root==null) return;
        if(lvl==ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(lvl).add(root.val);
        solve(root.left,lvl+1,ans);
        solve(root.right,lvl+1,ans);
    }
}