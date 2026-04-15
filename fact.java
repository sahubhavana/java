   public static int factorial(int n,int r){
       int factn=1;
       for(int i=n;i>0;i--){
           factn=factn*i;
       }
       int factr=1;
       for(int i=r;i>0;i--){
           factr=factr*i;
       }
       int factnr=1;
       for(int i=(n-r);i>0;i--){
           factnr=factnr*i;
       }
       int ncr=factn/(factr*factnr);
       return ncr;
   }
