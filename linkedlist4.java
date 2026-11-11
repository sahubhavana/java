 public void insertatposition(int position,int data){
          int count=0;
          Node newnode=new Node(data);
          Node temp=head;
          while(temp!=null&&count!=position-1){
              temp=temp.next;
              count++;
          }
          Node ttemp=temp.next;
          temp.next=newnode;
          newnode.next=ttemp;
      }
