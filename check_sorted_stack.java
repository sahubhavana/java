   public static boolean sorted(Stack<Integer> st) {

        // Base case
        if (st.size() <= 1) {
            return true;
        }

        // Ek case hum solve karenge
        int topval = st.peek();
        st.pop();

        int currval = st.peek();

        boolean ans = (topval <= currval);

        // Baaki recursion sambhalega
        boolean recans = sorted(st);

        boolean finalans = recans && ans;

        return finalans;
    }
