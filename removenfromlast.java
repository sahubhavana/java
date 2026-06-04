lass Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        int target=count-n;
        temp=head;
        int x=0;
        while(temp!=null && x!=count-n-1){

            
            temp=temp.next;
            x++;
        }
        temp.next=temp.next.next;


    
    return head;
    }
}
