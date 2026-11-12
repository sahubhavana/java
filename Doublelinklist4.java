 public void delhead(){
        node temp=head;
        node ttemp=head.next;
        temp.next=null;
        ttemp.prev=null;
        head=ttemp;
    }
