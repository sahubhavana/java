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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;

        while(temp1!=null && temp2!=null){
           
              temp1=temp1.next;
              temp2=temp2.next;

             
        }

        if(temp1==null){
            int bextralen=0;
            while(temp2!=null){
                bextralen++;
                temp2=temp2.next;
            }
        
        while(bextralen!=0){
            headB=headB.next;
            bextralen--;
        }
        }
        else{
            // b wali choti list ho 
            int aextralen=0;
            while(temp1!=null){
                aextralen++;
                temp1=temp1.next;
            } 
            while(aextralen!=0){
                headA=headA.next;
                aextralen--;
            }
        }
     
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }
}
