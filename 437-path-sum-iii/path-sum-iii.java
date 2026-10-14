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
    Map<Long,Integer> hm=new HashMap<>();
    int targetSum=0;
    public int pathSum(TreeNode root, int targetSum) {
        hm.put(0L,1);
        this.targetSum=targetSum;

        return dfs(root,0);
    }
    int dfs(TreeNode node,long curr){
        if(node==null){
            return 0;
        }
        curr+=node.val;

        int cnt=hm.getOrDefault(curr-targetSum,0);
        hm.merge(curr,1,Integer::sum);

        cnt+=dfs(node.left,curr);
        cnt+=dfs(node.right,curr);

        hm.merge(curr,-1,Integer::sum);

        return cnt;
    }   
}