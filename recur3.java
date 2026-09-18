public static void printnto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printnto1(n-1);
    }
