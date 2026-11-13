  public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
