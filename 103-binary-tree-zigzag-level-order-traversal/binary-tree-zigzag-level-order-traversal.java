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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        boolean flag=false;

        while(!q.isEmpty()){
            int lvl=q.size();
            List<Integer> ans=new ArrayList<>();
            
            for(int i=0;i<lvl;i++){
                TreeNode temp=q.poll();
                ans.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            if(flag){
                Collections.reverse(ans);
            }
            res.add(ans);
            flag=!flag;
        }
        return res;
    }
}