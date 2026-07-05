public static int coinchange(int amount,int[] arr){
        return coin(amount,arr,0);
}
public static int coin(int amount,int[]arr,int i){
        if (amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(i==arr.length){
            return 0;
        }
        int take=coin(amount-arr[i],arr,i);
        int nottake=coin(amount,arr,i+1);
        return take+nottake;
}
