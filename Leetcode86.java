class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode dummy1 = new ListNode(-1);
        ListNode temp1 = dummy1;

        // For greater or equal data
        ListNode dummy2 = new ListNode(-1);
        ListNode temp2 = dummy2;



        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode n=temp;
                temp1.next=n;
                temp1=temp1.next;
                temp=temp.next;
            }
            else if(temp.val>=x){
                ListNode n=temp;
                temp2.next=n;
                temp2=temp2.next;
                temp=temp.next;
            }
        }
        temp1.next=null;
        temp2.next=null;

        temp1.next=dummy2.next;
        return dummy1.next;
    }
}
