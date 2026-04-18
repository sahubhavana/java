5.Reverse a number
   static int rev=0;
   public static int reversenum(int n){
       if (n==0) return rev;
       rev=rev*10+(n%10);
       return reversenum(n/10);
   }
