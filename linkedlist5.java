public void update_Postion(int data,int position){
         Node temp=head;
         int count=0;
         while(temp!=null& count!=position-1){
             temp=temp.next;
             count++;
         }
         temp.data=data;
     }
