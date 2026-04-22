25.Rotate a matrix by 90 degree
       int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
       int n=matrix.length;
       int[][] rotated = new int[n][n];

       for(int i=n-1;i>=0;i--){

           for(int j=0;j<n;j++){
               rotated[j][n - 1 - i] = matrix[i][j];

           }
       }
       for(int i=0;i< matrix.length;i++){
           for(int j=0;j<matrix.length;j++){
               System.out.print(rotated[i][j]+" ");
           }
           System.out.println();
