class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        int x=m;
        Node temp=head;
        Node dummy=new Node(-1);
        Node temp1=dummy;
        while(temp!=null){
            if(m!=0){
                Node ttemp=temp;
                temp1.next=ttemp;
                temp1=temp1.next;
                temp=temp.next;
                m--;
            }
           
            else{
                for(int i=0;i<n && temp!=null;i++){
                    
                    temp=temp.next;
                }
                m=x;
                temp1.next=temp;;
            }
        }
       temp1.next=null;
    }
}
