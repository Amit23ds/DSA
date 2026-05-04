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
        Node temp = head;
        HashMap<Node, Node > hm = new HashMap<>();
        while(temp!=null){
            Node newNode = new Node(temp.val);
            hm.put(temp,newNode);
            temp=temp.next;
        }
        Node temp2=head;
        while(temp2!=null){
            Node copyNode = hm.get(temp2);
            copyNode.next=hm.get(temp2.next);
            copyNode.random=hm.get(temp2.random);
            temp2=temp2.next;
        }
        return hm.get(head);
    }
}