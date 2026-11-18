class Solution {
    public boolean detectLoop(Node head) {
        // code here
        
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
