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
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        // base case1 :if k>length
        if(k>length){
            return  head;
        }

    ListNode curr=head;
    ListNode prev=null;
    for(int i=1;i<=k;i++){
        ListNode ttemp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ttemp;
    }
    ListNode reversehead= reverseKGroup(curr , k);
    head.next=reversehead;

    return prev;
    }
}
