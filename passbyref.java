class Solution {
    public void reverse(int[] arr) {
          int h=arr.length/2;
          for(int i=0;i<h;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
          }
        
    }
}

