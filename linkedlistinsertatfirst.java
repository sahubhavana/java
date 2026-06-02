void insert_at_first(int val) {
        node newnode = new node(val);

        newnode.next = head;
        head = newnode;

    }
