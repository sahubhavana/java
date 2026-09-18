public static void printboth(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printboth(n-1);
        System.out.print(n);
    }
