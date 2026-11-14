  //delete last node

    public void dellast_node(){
        node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
    }
