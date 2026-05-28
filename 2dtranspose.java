//  67.Print array transpose
       int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int k = 0;
       int narr[][] = new int[arr.length][arr[0].length];
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               narr[j][k] = arr[i][j];
           }
           k++;
       }
       for (int i = 0; i < narr.length; i++) {
           for (int j = 0; j < narr.length; j++) {
               System.out.print(narr[i][j] + " ");
           }
           System.out.println();
       }
