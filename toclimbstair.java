26. to climb a stair

public static int stair(int n){
   if (n<=1) return 1;

   return stair(n-1)+stair(n-2) ;

}
