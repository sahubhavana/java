 9. to check number is Amstrong number  or not
       int count = 0;
       int x=num;
       if (num == 0) {
           count=1;
       } else {
           while (num > 0) {
               count++;
               num = num / 10;
           }
       }
       num=x;
       double sum=0;
           while(num>0){
               int n=num%10;
               sum=sum+(Math.pow(n,count));
               num=num/10;
           }
           if(x==sum){
               System.out.print("number is Amstrong");
           }
           else{
               System.out.print("number is not amstrong");
           }
