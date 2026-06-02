void insert_at_end(int val) {
        node newnode = new node(val);
        node temp = head;
        if (head == null) {
            head = newnode;
            return;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
        }
        temp.next = newnode;
        newnode.next = null;
    }
