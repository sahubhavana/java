public static void subarray(int[] arr,String s,int i){
        if(i==arr.length){
            System.out.print(s+" ");
            return;
        }
        subarray(arr,s+arr[i],i+1);
        subarray(arr,s,i+1);

    }
