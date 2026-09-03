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
    
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        int cnt=0;
        if(root==null) return 0;
        qu.add(root);
        while(!qu.isEmpty()){
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode temp=qu.poll();
                if(temp.left!=null){
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    qu.add(temp.right);
                }
            }
            cnt++;
        }
        return cnt;
    }
}