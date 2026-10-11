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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        dfs(root,targetSum,0,temp);
        return list;
    }
    void dfs(TreeNode root, int targetSum,int sum,List<Integer> temp ){
        if(root==null){
            return;
        }
        sum +=root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null && sum==targetSum){
            list.add(new ArrayList<>(temp));
        }
        dfs(root.left,targetSum,sum,temp);
        dfs(root.right,targetSum,sum,temp);
        temp.remove(temp.size()-1);
    }
}