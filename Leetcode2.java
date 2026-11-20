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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(-1);
        ListNode temp1=dummy;
        int tsum=0;
        int carry=0;
        int x=0;
        int sum1=0;
        int sum2=0;
        while(l1!=null || l2!=null){
            sum1=0;
            if(l1!=null){
              
              sum1=l1.val;
             
            }
            sum2=0;
            if(l2!=null){
                sum2=l2.val;
            }
            tsum=sum1+sum2+carry;
            x=tsum%10;
            carry=tsum/10;
           
            ListNode n=new ListNode(x);
            temp1.next=n;
            temp1=temp1.next;
             if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
            
        }
        if(carry!=0){
        ListNode n=new ListNode(carry);
        temp1.next=n;
        temp1=temp1.next;
        }
        return dummy.next;
    }
}
