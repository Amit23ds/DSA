/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> hm = new HashMap<>();
        ListNode temp=head;
        int pos=0;
        while(temp!=null){
            if(hm.containsKey(temp)){
                return temp;
            }
            hm.put(temp,pos);
            pos++;
            temp=temp.next;
        }
        return null;
    }
}