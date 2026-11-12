  public void del_particular(int data){
         Node temp=head;
         while(temp!=null&& temp.next.data!=data){
             temp=temp.next;
         }
         temp.next=temp.next.next;
     }
