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
    private static int lengthLL(ListNode head){
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode middleNode(ListNode head) {
        int n=lengthLL(head);
        int k=n/2;
        if(n==1) return head;
        if(head==null || head.next==null ) return null;
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                head=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}