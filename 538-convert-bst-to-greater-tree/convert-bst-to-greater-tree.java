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
    HashMap<Integer,Integer> hm=new HashMap<>();

    void inorder(TreeNode root,List<Integer> temp){
        if(root==null) return;
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);

    }
    public TreeNode convertBST(TreeNode root) {
        List<Integer> temp=new ArrayList<>();
        inorder(root,temp);

        int sum=0;
        for(int i=temp.size()-1;i>=0;i--){
            int x=temp.get(i);
            temp.set(i,sum+x);
            sum+=x;
            hm.put(x,temp.get(i));
        }
        helper(root,temp);
        return root;
    }
    void helper(TreeNode root,List<Integer> temp){
        if(root==null) return;
        helper(root.left,temp);
        int x=root.val;
        root.val=hm.get(x);
        helper(root.right,temp);

    }
}