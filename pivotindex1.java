public static int pivotindex(int[] arr){
        int x=0;
        int y=0;
        for(int i=1;i<arr.length-1;i++){
            for(int j=i-1;j>=0;j--){
                x=x+arr[j];
            }
            for(int k=i+1;k<arr.length;k++){
                y=y+arr[k];
            }
            if(x==y){
                return i;
            }
            x=0;
            y=0;
        }
        return 0;
}
