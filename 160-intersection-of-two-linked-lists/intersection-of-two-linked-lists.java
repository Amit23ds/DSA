/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int length(ListNode head){
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA, temp2=headB;
        int n1=length(temp1), n2=length(temp2);
        if(n1>n2){
            for(int i=1;i<=n1-n2;i++){
                temp1=temp1.next;
            }
        }else{
            for(int i=1;i<=n2-n1;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}