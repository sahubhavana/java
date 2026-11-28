class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            boolean colide=false;
            if(asteroids[i]>=0){
                st.push(asteroids[i]);
                
            }
            else{
               
                while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
                 if(st.peek()<Math.abs(asteroids[i])){
                  st.pop();
                  }
                  else{
                     if(st.peek()==Math.abs(asteroids[i])){
                        st.pop();
                        colide=true;
                        break;
                     }
                     else{
                         colide=true;
                         break;
                     }
                  }
                }
                if(!colide){
                    st.push(asteroids[i]);
                }
            }
            }
            int x=st.size();
            int []ans=new int[x];
            int i=x-1;
            while(!st.isEmpty()){
               ans[i]=st.peek();
                st.pop();
                i=i-1;
            }

          return ans;
        }
    }
