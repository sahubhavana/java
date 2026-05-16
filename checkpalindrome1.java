5.To check a palindrome or not

       int x = 0;
      int y=num;
   while(num>0){
       int n=num%10;
       x=x*10+n;
       num=num/10;
   }
   if(x==y) {
       System.out.print("number is palindrome" );
   }
   else{
       System.out.print("number is not palindrome");
   }
