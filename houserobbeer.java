public static int houserobber(int[] a,int i){
        if(i>=a.length){
            return 0;
        }
        int include=a[i]+houserobber(a,i+2);
        int exclude=0+houserobber(a,i+1);
        maxm=Math.max(include,exclude);
        return maxm;
    }
