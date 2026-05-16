4.Reverse a number
       int x=0;
   while(num>0){
       int n=num%10;
       x=x*10+n;
       num=num/10;
   }
   System.out.print("reverse number="+x);
