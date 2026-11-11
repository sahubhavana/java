
     public void delafter(int data){
         Node temp=head;
         while(temp!=null && temp.data!=data){
             temp=temp.next;
         }
         Node ttemp=temp.next.next;
         temp.next=ttemp;
     }
