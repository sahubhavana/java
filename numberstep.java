class Solution {
    int count=0;
    public int numberOfSteps(int num) {
        while(num>0){
            if(num%2==0){
                int x=num/2;
                num=x;
                count++;

            }
            else{
                if(num%2!=0){

                
                  num=num-1;
                  count++;
                }
            
        
                  
            }
        }
        return count;
    }
}
