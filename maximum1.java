public static int maximum1(int[][] arr){
        int ans=-1;
        int a=0;
//        int t1s=0;
//        int tf=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i][j]==1){
//                    t1s++;
//                }
//                if(t1s>tf){
//                    tf=t1s;
//                    ans=i;
//                }
//            }
//            t1s=0;
//        }
        for(int i=0;i<arr.length;i++){
            int x=oneindex(arr,i);
            int s=arr.length-x;
            if(s>ans){
                ans=s;
                a=i;
            }
        }
        return a;
    }
