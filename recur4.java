public static int exponent(int x,int n){
        if(n==0){
            return 1;
        }
        return x*exponent(x,n-1);
    }
