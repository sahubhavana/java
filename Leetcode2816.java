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

    ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
       
        while(temp!=null){
            ListNode ttemp=temp.next;
            temp.next=prev;
            prev=temp;
            temp=ttemp;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;
        ListNode temp=head;
        ListNode curr=reverse(temp);
        int sum=0;
        int carry=0;
        int x=0;
        while(curr!=null){
            sum=sum+curr.val*2;
            x=sum%10;
            carry=sum/10;
            ListNode ttemp=new ListNode(x);
            temp1.next=ttemp;
            temp1=temp1.next;
            sum=carry;
            curr=curr.next;
        }
        if(carry!=0){
            ListNode ttemp=new ListNode(carry);
            temp1.next=ttemp;
            temp1=temp1.next;
        }
        ListNode rev=reverse(dummy.next);
        return rev;
    }
}
