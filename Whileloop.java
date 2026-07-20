class Solution {
    public int whileLoop(int d) {
        int i=1;
        int sum=0;
      while(i<=50){
        if(i%10==d){
           sum=sum+i;
      }
      i++;
    }
      return sum;
    }
}
