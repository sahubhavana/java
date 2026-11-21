/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]ans=new ListNode[k];
        int length=0;
        int width=0;
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int basecase=length/k;
        int extracase=length%k;
        ListNode curr=head;
        ListNode prev=null;
        for(int part=0;part<k;part++){
            if(curr==null){
                ans[part]=curr;
                continue;

            }
            ans[part]=curr;
           
            width=basecase+(extracase>0 ? 1:0);
                
            if (extracase > 0) {
                extracase--;
            }
            
            for(int i=0;i<width;i++){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            prev=null;
        }
        return ans;

}
}
