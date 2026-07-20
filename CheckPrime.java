class Solution {
    public boolean isPrime(int n) {
          boolean x=true;
          for(int i=2;i<n;i++){
            if(n%i==0){
                x=false;
            }
          }
          return x;
    }
}
