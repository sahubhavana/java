class Solution {
    
    public Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node ttemp=temp.next;
            temp.next=prev;
            prev=temp;
            temp=ttemp;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // step1: Reverse a orignal list
        head=reverse(head);
        Node temp=head;
        int carry=1;
        
        //  step2: Add a carry in value 
        while(temp!=null){
           int nodeval=temp.data;
           int sum=nodeval+carry;
           int digit=sum%10;
           temp.data=digit;
           carry=sum/10;
           
         
           //edge case if there will carry or no node present 
           
           if(temp.next==null && carry>0){
               temp.next=new Node(carry);
               carry=0;
           }
        temp=temp.next;
           
    }
    
    /// step3: once again reverse list
    
    head=reverse(head);
    
    // step4: return head
    return head;
    }
}
