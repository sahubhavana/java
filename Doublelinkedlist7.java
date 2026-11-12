
    public void del_after(int data){
        node temp=head;
        while(temp!=null && temp.data!=data){
            temp=temp.next;
        }
        node ttemp=temp.next.next;
        temp.next=ttemp;
        ttemp.prev=temp;
    }
