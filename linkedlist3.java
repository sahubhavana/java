
///  delete a first node
     public void delfirst(){
         Node temp=head.next;
         head.next=null;
         head=temp;
     }
