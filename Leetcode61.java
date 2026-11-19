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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        int n = 0;
        ListNode curr = head;

        while (curr != null) {
            n++;
            curr = curr.next;
        }

        k = k % n;
        for(int i=0;i<k;i++){
            ListNode temp=head;
            while(temp.next.next!=null){
                
                temp=temp.next;
            }
            
            ListNode ttemp=temp.next;
            temp.next=null;
            ttemp.next=head;
            head=ttemp;
        }
        return head;
    }
}
