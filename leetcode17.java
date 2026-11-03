import java.util.*;
class Solution {
    static void solve(String digits,String[]mapping,StringBuilder output,int index,List<String> result){
        // Base case
        if(index>=digits.length()){
            result.add(output.toString());
            return;
        }
        int number=digits.charAt(index)-'0';
        String mapped=mapping[number];
        for(int i=0;i<mapped.length();i++){
            output.append(mapped.charAt(i));
            solve(digits,mapping,output,index+1,result);
            output.deleteCharAt(output.length() - 1);
        }
          }
    public List<String> letterCombinations(String digits) {
        String [] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        StringBuilder output=new StringBuilder();
        List<String> result=new ArrayList<>();
        solve(digits,mapping,output,index,result);
        return result;

    }
}
