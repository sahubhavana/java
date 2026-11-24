public static boolean isvalid_string(Stack<Character>st,String s){

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='c'){
                st.push(ch);
            }
            else{
                if (st.size() < 2) {
                    return false;
                }

                if (st.peek() == 'b') {
                    st.pop();
                } else {
                    return false;
                }

                if (st.peek() == 'a') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();



    }
