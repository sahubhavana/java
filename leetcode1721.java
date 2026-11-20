class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<=k-1;i++){
            temp=temp.next;
        }
        ListNode temp1=temp.next;
        ListNode temp2=head;
        while(temp1!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        int val1=temp.val;
        temp.val=temp2.val;
        temp2.val=val1;
        return head;
    }
}
