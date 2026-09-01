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
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> temp=new LinkedList<TreeNode>();

        if(root==null) return res;

        temp.add(root);
        while(!temp.isEmpty()){
            int lvl=temp.size();
            List<Integer> subList=new LinkedList<Integer>();
            for(int i=0;i<lvl;i++){
                if(temp.peek().left!=null) temp.add(temp.peek().left);
                if(temp.peek().right!=null) temp.add(temp.peek().right);

                subList.add(temp.poll().val);
            }
            res.add(subList);
        }

        return res;

    }
}