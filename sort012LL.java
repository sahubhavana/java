class Solution {
    public Node segregate(Node head) {
        // code here
        Node dummyo=new Node(-1);
        Node otail=dummyo;
        Node dummy1=new Node(-1);
        Node tail1=dummy1;
        Node dummy2=new Node(-1);
        Node tail2=dummy2;
        
        
        Node temp=head;
        while(temp!=null){
            Node nextNode = temp.next;
            temp.next = null;
            if(temp.data==0){
                Node onode=temp;
                
                otail.next=onode;
                otail=onode;
                
            }
            else if(temp.data==1){
                Node node1=temp;
               
                tail1.next=node1;
                tail1=node1;
               
            }
            else if(temp.data==2){
                Node node2=temp;

                tail2.next=node2;
                tail2=node2;
              
        }
        
        temp = nextNode;

        
    }
    otail.next=(dummy1.next!=null)? dummy1.next:dummy2.next;
    tail1.next=dummy2.next;
    
    return dummyo.next;
}
}
