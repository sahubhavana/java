public static boolean subsetsum(int[]arr,int i){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int sum1=sum/2;
        if((sum&1)==1){
            return false;
        }
        return solve(arr,sum1,0);
}
public static boolean solve(int[]arr,int sum1,int i){
        if(sum1==0){
            return true;
        }
        if(sum1<0){
            return false;
        }
        if(i>=arr.length){
            return false;
        }
        boolean include=solve(arr,sum1-arr[i],i+1);
        boolean exclude=solve(arr,sum1,i+1);
        return include||exclude;
}
