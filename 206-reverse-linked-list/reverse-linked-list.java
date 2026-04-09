/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode removeTail(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    private ListNode addTail(ListNode head, int value){
        if(head==null) return new ListNode(value);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode newNode=new ListNode(value);
        temp.next=newNode;
        return head;
    }
    public ListNode reverseList(ListNode head) { 
        ListNode temp=head;
        ListNode newNode=null;
        while(temp!=null){
            ListNode temp1=temp;
            while(temp1.next!=null){
                temp1=temp1.next;
            }
            newNode=addTail(newNode,temp1.val);
            temp=removeTail(temp);
        }
        return newNode;
    }
}