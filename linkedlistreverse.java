class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp1;
        ListNode temp=head;
        while(temp!=null){
            temp1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=temp1;
        }
        return prev;
    }
}
