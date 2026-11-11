public void dellast(){
         Node temp=head;
         while(temp.next.next!=null){
             temp=temp.next;
         }
         temp.next=null;
     }
