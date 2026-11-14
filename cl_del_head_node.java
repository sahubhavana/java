 public void del_head(){
        node temp=head;
        node temp1=head.next;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=temp1;
        head=temp1;

    }
