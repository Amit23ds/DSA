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
    private int length(ListNode head){
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head, prev=null, newHead=null;
        if(head==null || head.next==null) return head;
        int l=length(head);
        k=k%l; 
        if(k==0) return head;
        for(int i=1;i<l-k;i++){
            temp=temp.next;
        }
        newHead=temp.next;
        ListNode temp1=newHead;
        while(temp1!=null){
            prev=temp1;
            temp1=temp1.next;
        }
        prev.next=head;
        temp.next=null;
        return newHead;
    }
}