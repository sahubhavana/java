class Solution {
    static ArrayList<String> ls = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        //your code goes here
        bin(n,0,0,"");
        return ls;
    }
    public static bin(int n,int open,int close,String s){
        if(s.length()==2*n){
            l.add(s);
            return ;
        }
        if(open<n){
            bin(n,open+1,close,s+"(");
        }
        if(close<open){
            bin(n,open,close+1,s+")");
        }
    }
    }
