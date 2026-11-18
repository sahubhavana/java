class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count=0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(k>count){
            return -1;
        }
        count=count-k;
        Node curr1=head;
        while(count!=0){
            count=count-1;
            curr1=curr1.next;
        }
        return curr1.data;
    }
}
