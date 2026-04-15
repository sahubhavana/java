 public static void checkprime(int num){
       boolean b=true;
       for(int i=2;i<num;i++){
           if(num%i==0){
               b=false;
           }

       }
       if(b==true){
           System.out.println("number is prime");
       }
       else{
           System.out.println("number is not prime");
       }
   }
