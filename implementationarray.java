class Stack {
    int top;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push element
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop element
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped");
            top--;
        }
    }

    // Peek element
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}
