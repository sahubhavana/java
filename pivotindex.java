61.find a pivot index element
        int arr[]={1,7,3,6,5,6};
       for (int i = 1; i < arr.length; i++) {

           int sum = 0;

           // left sum
           for (int k = 0; k < i; k++) {
               sum = sum + arr[k];
           }

           int sum1 = 0;

           // right sum
           for (int j = i + 1; j < arr.length; j++) {
               sum1 = sum1 + arr[j];
           }

           if (sum == sum1) {
               System.out.println("Pivot index: " + i);
               return;
           }
       }

       System.out.println(-1);
