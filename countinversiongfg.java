class Solution {
    public static int merge1(int[] arr, int s, int e, int mid) {
           int leftlen = mid - s + 1;
           int rightlen = e - mid;
           int[] leftarray = new int[leftlen];
           int[] rightarray = new int[rightlen];


           //       copy left half part
           int k = s;
           for (int i = 0; i < leftlen; i++) {
               leftarray[i] = arr[k];
               k++;
           }

           //        copy right half part

           k = mid + 1;
           for (int i = 0; i < rightlen; i++) {
               rightarray[i] = arr[k];
               k++;
           }
           int inversioncount = 0;
           int i = 0;
           int j = 0;
           k = s;
           while (i < leftarray.length && j < rightarray.length) {
               if (leftarray[i] <= rightarray[j]) {
                   arr[k] = leftarray[i];
                   i++;
                   k++;
               } else {
                   arr[k] = rightarray[j];
                   j++;
                   k++;
                   inversioncount = inversioncount + (leftlen - i);
               }
           }
           //if any  of array either left or right will be left to fill

           while (i < leftarray.length) {
               arr[k] = leftarray[i];
               i++;
               k++;
           }

           while (j < rightarray.length) {
               arr[k] = rightarray[j];
               j++;
               k++;
           }
           return inversioncount;
       }
       
       static int solve(int[] arr, int s, int l) {
              int start = s;
              int end = l;
              if (start >= end) {
                  return 0;
              }
              int mid = (start + end) / 2;
              int leftinversion = solve(arr, start, mid);
              int rightinversion = solve(arr, mid + 1, l);
              int intermeddiate = merge1(arr, start, end, mid);
              int inversioncount = leftinversion+rightinversion+intermeddiate;

              return inversioncount;
          }
    public int inversionCount(int arr[]) {
        // code here
        int s=0;
        int l=arr.length-1;
        int x=solve(arr,s,l);
        return x;
        
    }
}
