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
    public void reverseList(ListNode head) {
        ListNode temp=head,prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
    }
    public ListNode getkthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head, prev=null;
        while(temp!=null){
            ListNode kthNode = getkthNode(temp,k);
            if(kthNode==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next=null;
            reverseList(temp);
            if(temp==head){
                head=kthNode;
            }else{
                prev.next=kthNode;
            }
            prev=temp;
            temp=nextNode;

        }

        return head;
    }
}