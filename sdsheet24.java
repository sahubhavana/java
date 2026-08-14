class Solution {
    public int maxLen(int[] arr) {
        int maxlen=0; 
        
       for(int i=0;i<arr.length;i++){
           int count=0;
           int sum=0;
           for(int j=i;j<arr.length;j++){
             sum=sum+arr[j];
             count++;
              
           if(sum==0){
            if(count>maxlen){
                maxlen=count;
            }
           }
           }
       }
        return maxlen;
    }
       }
