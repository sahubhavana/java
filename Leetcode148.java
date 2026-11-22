class Solution {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        int len = 0;
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        ListNode curr = head;

        while(len > 1){

            if(curr.next != null){

                if(curr.val > curr.next.val){
                    int x = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = x;
                }

                curr = curr.next;
            }

            if(curr.next == null){
                curr = head;
                len--;
            }
        }

        return head;
    }
}
