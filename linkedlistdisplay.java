void display(){
        node temp=head;
        if(head==null){
            System.out.print("no node is present");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
    }
