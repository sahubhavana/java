 public static void digit(int n){
        if(n==0){
            return;
        }
        int x=n%10;
        digit(n/10);
        System.out.print(x+" ");

        }
