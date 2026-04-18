 7.to print sum of digit in a number
   static int sum=0;
public static int sumdigits(int num) {
   if (num==0) return sum;
   int x=num%10;
   sum=sum+x;
   return sumdigits(num/10);
}
