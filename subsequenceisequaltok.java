public static boolean solve(int[]a,int k,int i,int sum){
        if(i>=a.length){
            if(sum==k){
                return true;
            }
            else{
                return false;
            }
        }
        boolean include=solve(a,k,i+1,sum+a[i]);
        boolean exclude=solve(a,k,i+1,sum);
        return include||exclude;

    }
    public static boolean subsequence(int a[],int k){
        int sum=0;
        int i=0;
        for(int x:a){
            sum=sum+x;
        }
        if(sum<k){
            return false;
        }
        sum=0;
        boolean x=solve(a,8,i,sum);
        return x;
    }
