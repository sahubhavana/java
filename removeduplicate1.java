 public static int removeduplicate(int[]arr){
        int al=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                al++;
            }
        }
        return al+1;

        }
