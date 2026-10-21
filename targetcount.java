 static int tcount=0;
    public static int targetcount(int[]a,int target,int i){
        if(i==a.length){
            return tcount;
        }
        if(a[i]==target){
            tcount=tcount+1;
        }
        return targetcount(a,target,i+1);
    }
