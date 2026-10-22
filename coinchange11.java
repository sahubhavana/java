public static int coinchangeii(int[]a,int i,int amount){
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(i>=a.length){
            return 0;
        }
        int include=coinchangeii(a,i,amount-a[i]);
        int exclude=coinchangeii(a,i+1,amount);
        int finalans=include+exclude;
        return finalans;
    }
