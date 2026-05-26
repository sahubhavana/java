Arrange 0s and 1s
       int arr[] = {1, 0, 1, 0, 1, 1, 0};
       int j = arr.length - 1;
       int i=0;
       while(i<j){
           if (arr[i] == 1 && arr[j] == 0) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
           if (arr[j] == 1) {
               j--;
           }
           if(arr[i]==0){
               i++;
           }

       }
       for (i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
