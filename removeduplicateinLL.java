class Solution {
    Node removeDuplicates(Node head) {
        // code here
        if (head == null) return head;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null){
            if(slow.data==fast.data){
                slow.next=fast.next;
                fast=fast.next;
               
            }
            else{
                fast=fast.next;
                slow=slow.next;
            }
           
        }
        return head;
    }
}
