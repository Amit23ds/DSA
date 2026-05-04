/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        Node temp2=head;
        while(temp2!=null){
            Node copyNode =temp2.next;
            if(temp2.random==null) copyNode.random=null;
            else copyNode.random=temp2.random.next;
            temp2=temp2.next.next;
        }
        Node temp3=head;
        Node dNode = new Node(-1);
        Node res=dNode;
        while(temp3!=null){
            Node copyNode = temp3.next;
            res.next=copyNode;
            temp3.next=copyNode.next;
            res=res.next;
            temp3=temp3.next;
        }
        return dNode.next;
    }
}