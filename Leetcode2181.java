class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode temp = head;
        ListNode curr = head.next;

        int sum = 0;

        while (curr != null) {

            if (curr.val != 0) {
                sum += curr.val;
            } 
            else {
                temp.val = sum;
                temp.next = curr.next;
                temp = temp.next;
                sum = 0;
            }

            curr = curr.next;
        }

        return head;
    }
}
