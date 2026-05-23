6.Convert a decimal to Binary manualy
       int a=sc.nextInt();
       String s=" ";
       while(a>0){
           int x=a%2;
           s=s+x;
           a=a/2;
       }
       System.out.print(s);
