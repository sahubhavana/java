 ListNode temp=head;
        ListNode temp1=head;
        while(temp.next!=null && temp!=null){
            temp1=temp.next;
            temp=temp.next.next;
            
        }
  
        return temp1;
    }
