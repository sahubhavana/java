public void swap_1_2(){
        node temp=head;
        node temp1=head.next;

        while(temp.next!=head){
            temp=temp.next;
        }
        head.next=temp1.next;
        temp1.next=head;
        head=temp1;
        temp.next=head;
    }
