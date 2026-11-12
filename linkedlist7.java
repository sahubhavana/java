    public  void reverse_list(){
         Node temp=head;
         Node prev=null;
         Node ttemp=null;
         while(temp!=null){
             ttemp=temp.next;
             temp.next=prev;
             prev=temp;
             temp=ttemp;
         }
         head=prev;
     }
