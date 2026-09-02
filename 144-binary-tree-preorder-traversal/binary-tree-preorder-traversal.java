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
    //List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        //TreeNode temp=root;
        // preorder(root);
        // return res;
        List<Integer> preorder=new ArrayList<>();
        if(root==null) return preorder;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }

        return preorder;
    }
    // void preorder(TreeNode root){
    //     if(root ==null){
    //         return;
    //     }
    //     res.add(root.val);
    //     preorder(root.left);
    //     preorder(root.right);
    // }
}