   public static int sumnumber(int n){

       if (n==0) return 0;
       return n+(sumnumber(n-1));
   }
