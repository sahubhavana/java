27.print all the possible binary of number
    public static void bin(String s,int n){
       if(n==0) {
           System.out.println(s+" ");
           return;
       }
       bin(s+"0",n-1);
       bin(s+"1",n-1);

    }
