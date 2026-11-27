class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        
       
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
           while(!st.isEmpty() && k>0 && st.peek()>ch){
                 st.pop();
                 k--;
           }
           st.push(ch);
    }

    // if agar kuch removal baki hai 
     while(k>0 && !st.isEmpty()){
        st.pop();
        k--;
     }


     /// add in ans  

     while(!st.isEmpty()){
        sb.append(st.peek());
        st.pop();
     }

     sb.reverse();

     // remove a leading zeros 

     int index=0;
     while(index<sb.length() && sb.charAt(index)=='0'){
        index++;
     }
    if(index==sb.length()){
        return "0";
    }
    String ans="";

    ans=sb.substring(index);
    if(sb.length()==0){
        return "0";
    }
    else{
        return ans;
    }

}
}
