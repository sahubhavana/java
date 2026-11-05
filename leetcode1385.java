class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count=0;
        int i=0;
        int j=0;
        for(i=0;i<arr1.length;i++){
            boolean valid =true;
            for(j=0;j<arr2.length;j++){
                int x=Math.abs(arr1[i]-arr2[j]);
                if(x<=d){
                    valid =false;
                }
            }
            if(valid==true){
                count++;
            }
        }
    return count;
    }
}
