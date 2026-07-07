class Solution {
    ArrayList<String>ans=new ArrayList<>();
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
        backtrack(0,digit,"");
        return ans;
    }
    void backtrack(int index, String digits,String current){

    if(index == digits.length()){
        ans.add(current);
        return;
    }

    String letters = map[digits.charAt(index)-'0'];

    for(char ch : letters.toCharArray()){

        current += ch;

        backtrack(index+1, current);

        current = current.substring(0, current.length()-1);
    }
}
}
