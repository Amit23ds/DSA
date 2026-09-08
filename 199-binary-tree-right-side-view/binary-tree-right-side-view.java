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
class Tuple{
    TreeNode node;
    int row;
    public Tuple(TreeNode node,int row){
        this.node=node;
        this.row=row;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();

        if(root==null) return list;
        q.offer(new Tuple(root,0));
        while(!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            map.put(x,node.val);
            if(node.left!=null)
                q.offer(new Tuple(node.left,x+1));

            if(node.right!=null)
                q.offer(new Tuple(node.right,x+1));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}