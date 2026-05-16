1.Print each digit of number
       int s=0;
       while(num>0) {

           int n = num % 10;
           s = s * 10 + n;
           num = num / 10;

       }
       while(s>0){
           int n=s%10;
           System.out.println(n);
           s=s/10;
       }
