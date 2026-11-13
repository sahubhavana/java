  /// find a middle of node

    public void find_middle(){
        if(head==null){
            System.out.print("List is empty");
        }

        node temp=head;
        int count=1;
        while(temp!=head){
            count++;
            temp=temp.next;
        }
        node slow = head;
        node fast = head;

        while (fast.next != head &&
                fast.next.next != head) {

            slow = slow.next;
            fast = fast.next.next;
        }
        if(count%2!=0){
            System.out.print(slow.data);
        }
        else{
            System.out.print(slow.next.data);
        }
    }
