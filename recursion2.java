2.  Printing a number from 1 to 5
public static void printnumber(int n){
   if (n==0) return ;
   printnumber(n-1);
   System.out.println(n);
}
   public static int sumnumber(int n){
