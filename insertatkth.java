void inset_at_kth(int val,int k){
        node newnode = new node(val);
        node temp=head;
        int i=1;
        while(temp.next!=null && i!=k-1){
            temp=temp.next;
            i++;
        }
        node temp1=temp.next;
        temp.next=newnode;
        newnode.next=temp1;
    }
