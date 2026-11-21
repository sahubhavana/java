
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp!=null){

            // node doesnot have child 
            if(temp.child==null){
                temp=temp.next;
            }
            // node have child
            else{
                 Node ttemp=temp.next;
                 temp.next=temp.child;
                 temp.child.prev=temp;
                 temp.child=null;
                 Node last = temp.next;
                 while(last.next!=null){
                 last=last.next;    
            }
            last.next = ttemp;
            if (ttemp != null) {
                    ttemp.prev = last;
                }
           
        }
        }
        return head;
    
}
}
