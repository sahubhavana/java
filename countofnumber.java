6.to print a count of number in a digit
   static int count=0;
   public static int countprint(int num){
       if(num==0) return count;
       count=count+1;

       return countprint(num/10);
    }
