import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        Stack<String>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        Stack<String>st1=new Stack<>();
        String[] s=path.split("/");
        for(String i:s){
            
            if(i.equals("")||i.equals(".")){
                continue;
            }
           
            if(i.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
            }
            else{
                 st.push(i);
            }
            }
        
        while(!st.isEmpty()){
            st1.push(st.peek());
            st.pop();
        }
       
        while(!st1.isEmpty()){
          
          sb.append("/"+st1.pop());
         
        }
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}
