public void del_before(int data) {

    if (head == null || head.next == null) {
        return;
    }

    node temp = head;

    while (temp.next != null && temp.next.next != null
            && temp.next.next.data != data) {
        temp = temp.next;
    }

    if (temp.next == null || temp.next.next == null) {
        return;
    }

    node ttemp = temp.next;

    temp.next = ttemp.next;
    ttemp.next.prev = temp;
}
