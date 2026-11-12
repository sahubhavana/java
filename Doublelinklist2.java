/// insert a new node

    public void insertnewnode(int data){
        node temp=head;
        node newnode=new node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
