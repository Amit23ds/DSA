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
    public List<Integer> postorderTraversal(TreeNode root) {
        //postorder(root);
        //return res;
        // List<Integer> postorder=new ArrayList<>();
        // Stack<TreeNode> st1=new Stack<>();
        // Stack<TreeNode> st2=new Stack<>();

        // if(root==null) return postorder;
        // st1.push(root); 
        // while(!st1.isEmpty()){
        //     root=st1.pop();
        //     st2.add(root);
        //     if(root.left!=null) st1.push(root.left);
        //     if(root.right!=null) st1.push(root.right);
        // }
        // while(!st2.isEmpty()){
        //     postorder.add(st2.pop().val);
        // }
        // return postorder;
        List<Integer> postorder=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr=curr.left;
            }else{
                TreeNode temp=st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    postorder.add(temp.val);
                    while(!st.empty() && temp==st.peek().right){
                        temp=st.pop();
                        postorder.add(temp.val);
                    }
                }else{
                    curr=temp;
                }
            }
        }
        return postorder;

    }
    // void postorder(TreeNode root){
    //     if(root==null){
    //         return;
    //     }
    //     postorder(root.left);
    //     postorder(root.right);
    //     res.add(root.val);

    // }
}