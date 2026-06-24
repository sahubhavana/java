 public static boolean checksorted(int[]arr,int n){
        if(n==0||n==1){
            return true;
        }

        return (arr[n-1]>=arr[n-2]) && checksorted(arr,n-1);

    }
