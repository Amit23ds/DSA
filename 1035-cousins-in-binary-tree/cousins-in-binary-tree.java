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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val==x) return false;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean found=false;

        while(!q.isEmpty() && !found){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if((t.left!=null && t.left.val==x) || (t.right!=null && t.right.val==x)){
                    found=true;
                    t.left=null;
                    t.right=null;
                }
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
            }
        }
        int n=q.size();
        for(int i=0;i<n;i++){
            TreeNode t=q.poll();
            if(t.val==y) return true;
        }
        return false;
    }
}