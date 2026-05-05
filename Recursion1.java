 1. printing a number from 5 to 1
   public static void printnumber(int n){
       if (n==0) return ;
       System.out.println(n);
       printnumber(n-1);
   }
