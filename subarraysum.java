public static int subarraysum(int[] arr) {
        int lsum = 0;
        int sum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            sum = sum + arr[i];
//            for (int j = i + 1; j < arr.length; j++) {
//                sum = sum + arr[j];
//                if(sum>lsum){
//                    lsum=sum;
//                }
//            }
//            sum=0;
//        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>lsum){
                lsum=sum;
            }
        }
        return lsum;
    }
