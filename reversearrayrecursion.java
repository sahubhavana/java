class Solution {
    public void reverse(int[] arr, int n) {
         rev(arr,0,arr.length-1);
      
    }
    public static void rev(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
       
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            rev(arr,left+1,right-1);
        
    } 
}

