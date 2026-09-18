public static void print1ton(int n){
        if(n==0){
            return;
        }
        print1ton(n-1);
        System.out.print(n);
    }
