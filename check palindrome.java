8. to check a palindrome or not

   static int rev=0;
   public static int palindrome (int n){
       if (n==0) return rev;
       rev=rev*10+(n%10);
       return palindrome(n/10);
   }
