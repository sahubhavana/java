import java.util.*;
public class finalStack {
// Representation of stack with the help of Array


    //static class Mystack{
//        private int[] arr;
//        private int capacity;
//        private int top;
//
//        public Mystack(int capacity){
//            this.capacity=capacity;
//            this.arr=new int[capacity];
//            this.top=-1;
//        }
//        public void push(int val){
//            /// edge case
//            if(top==arr.length-1){
//                System.out.println("Stack is full");
//                return;
//            }
//            top++;
//            arr[top]=val;
//
//        }
//        public void pop(){
//            //edge case
//            if(top==-1){
//                System.out.println("stack is empty");
//                return;
//            }
//            arr[top]=-1;
//            top--;
//        }
//        public int peek(){
//            if(top==-1){
//                return -1;
//
//            }
//            int x=0;
//            x=arr[top];
//            return x;
//        }
//        public boolean isempty() {
//            if (top == -1) {
//                return true;
//            }
//            return false;
//        }
//        public int size(){
//
//            return (top+1);
//        }


//    Representation of stack with the help of Linked list

    static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    static class mystack {
        Node top = null;

        public void push(int val) {

            Node temp = new Node(val);
            temp.next = top;
            top = temp;
        }

        public void pop() {
            if (top == null) {
                System.out.print("Stack is empty");
                return;
            }
            top = top.next;

        }

        public int peek() {
            if (top == null) {
                System.out.print("stack is empty");
                return -1;
            }
            return top.data;
        }

        public boolean is_empty() {
            if (top == null) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
//        Mystack st=new Mystack(3);
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        int x=st.peek();
//        System.out.print("peek element="+x);
          mystack nd=new mystack();
          nd.push(20);
          nd.push(30);
          nd.push(40);
          nd.pop();
          nd.pop();
          int x=nd.peek();
          System.out.println(x);
          System.out.print(nd.is_empty());



    }
}
