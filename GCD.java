class Solution {
    public int GCD(int n1, int n2) {
      int max = Math.max(n1, n2);
      int r=0;
      for(int i=0;i<max;i++){
        if(n1%i==0  && n2%i==0){
              r=i;
              break;
        }
      }
      return r;
    }
}
