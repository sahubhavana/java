public static boolean search(int [][] arr,int target){
        int r=arr.length;
        int c=arr[0].length;
        int rr=0;
        int cc=c-1;
        while(rr<r && cc>=0 ){
            if(arr[rr][cc]==target){
                return true;
            }
            else{
                if(arr[rr][cc]>target){
                    cc--;
                }
                else{
                    rr++;
                }
            }
        }
        return false;
    }
