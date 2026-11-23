class Solution {
    public boolean checkRedundancy(String s) {
        // code here
    
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch!=')' ){
                st.push(ch);
            }
            else{
                  boolean  ans=false;
            
       
                      while(!st.isEmpty() && st.peek() != '('){
                          char top=st.pop();
                          if(top=='+'|| top=='-'|| top=='/' || top=='*'){
                             
                              ans=true;
                          }
                          
                      }
                      if(!ans) {
                                          return true;
                                      }

                                      if(!st.isEmpty()) {
                                          st.pop();
                                      }
                  }
            }
        
        return false;
    }
}
