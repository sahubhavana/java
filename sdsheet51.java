import java.util.*;

class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    public void backtrack(String digits, int index, StringBuilder current) {

        // Base Case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Get letters of current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            // Choose
            current.append(letters.charAt(i));

            // Explore next digit
            backtrack(digits, index + 1, current);

            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }
}
