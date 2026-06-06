public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int s=0;
        int end=r*c;
        while(s<=end){
            int mid=s+(end-s)/2;
            int ri=mid/c;
            int ci=mid%c;
            if(matrix[ri][ci]==target){
                return true;
            }
            else{
                if(matrix[ri][ci]>target){
                    end=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return false;
    }
}
