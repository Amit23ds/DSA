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
        ListNode tail=head,temp=head;
        if(head==null || head.next==null) return head;
        int l=length(head);
        k=k%l; 
        if(k==0) return head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        int cnt=0;
        while(temp!=null){
            if(cnt==l-k-1){
                break;
            }
            cnt++;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}