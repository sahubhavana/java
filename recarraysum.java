public static int printsumarray(int[] arr,int i){
        if(i==arr.length){
            return sum;
        }
        sum=sum+arr[i];
        return printsumarray(arr,i+1);

    }
