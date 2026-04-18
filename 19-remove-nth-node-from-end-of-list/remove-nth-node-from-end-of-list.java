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
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newNode;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=reverse(head);
        if(temp==null) return temp;
        if(n==1){
            temp=temp.next;
            ListNode re=reverse(temp);
            return re;
        }
        int cnt=0;
        ListNode te=temp;
        ListNode prev=null;
        while(te!=null){
            cnt++;
            if(cnt==n){
                prev.next=prev.next.next;
            }
            prev=te;
            te=te.next;
        }
        ListNode ans=reverse(temp);
        return ans;
    }
}