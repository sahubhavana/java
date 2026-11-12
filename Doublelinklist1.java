
    /// insert at beginning

    public void insert_beggning(int data){
        node temp=head;
        node newnode=new node(data);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
