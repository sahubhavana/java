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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
         n++;
         temp=temp.next;
        }
        int[] ans=new int[n];
        ListNode temp1=head;
        Stack<int[]> st = new Stack<>();
        int i=0;
        while(temp1!=null){
        while(!st.isEmpty() && st.peek()[0]<temp1.val){
            ans[st.peek()[1]]=temp1.val;
            st.pop();
        }
        st.push(new int[]{temp1.val,i});
        i++;
        temp1=temp1.next;

        }
        return ans;
    }

}
