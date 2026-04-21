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
    private ListNode findMid(ListNode head){
        ListNode fast=head.next,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1, t2=list2;
        ListNode dNode = new ListNode(-1);
        ListNode temp=dNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }else{
            temp.next=t2;
        }
        return dNode.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle = findMid(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);
        return mergeTwoLists(left,right);
    }
}