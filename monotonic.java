 int[] arr = {3,10,4,7,4,8,2,10,6};

                Stack<Integer> st = new Stack<>();
                int[] ans = new int[arr.length];

                for(int i = arr.length - 1; i >= 0; i--) {

                    // Remove smaller elements
                    while(!st.isEmpty() && st.peek() <= arr[i]) {
                        st.pop();
                    }

                    // If stack empty, no greater element
                    if(st.isEmpty()) {
                        ans[i] = -1;
                    } else {
                        ans[i] = st.peek();
                    }

                    // Push current element
                    st.push(arr[i]);
                }

                System.out.println(Arrays.toString(ans));
