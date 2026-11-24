 public static void sortedInsert(Stack<Integer>st,int x){
        // base case
        if(st.isEmpty()){
            st.push(x);
            return;
        }

        //sabse pahle ckeck with topvalue
        int topval=st.peek();
        if(topval<x){
            st.pop();
            sortedInsert(st,x);
            // recursion kuch kam karna hai
            st.push(topval);
            return;
        }
        else{
            st.push(x);
            return;
        }
    }
