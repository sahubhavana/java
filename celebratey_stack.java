
class Solution {
    public int celebrity(int mat[][]) {

        int n = mat.length;

        if (n == 0) return -1;

        Stack<Integer> st = new Stack<>();

        // Step 1: Push all people
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Eliminate non-celebrities
        while (st.size() >= 2) {

            int a = st.pop();
            int b = st.pop();

            if (mat[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }

        // Step 3: Get potential celebrity
        int celebIndex = st.pop();

        // Step 4: Verify candidate
        for (int i = 0; i < n; i++) {

            // Celebrity should not know anyone
            // Everyone else should know celebrity
            if (i != celebIndex) {
                if (mat[celebIndex][i] == 1 ||
                    mat[i][celebIndex] == 0) {
                    return -1;
                }
            }
        }

        return celebIndex;
    }
}
