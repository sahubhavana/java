   /// insert at position

    public void at_position(int position,int data){
        node temp=head;
        node newnode=new node(data);
        int count=0;
        while(temp!=null&&count==position-1){
            temp=temp.next;
        }
        node ttemp=temp.next;
        temp.next=newnode;
        newnode.prev=temp;
        ttemp.prev=newnode;
        newnode.next=ttemp;
    }
