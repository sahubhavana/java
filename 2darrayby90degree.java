68.Print  rotate matrix by 90 degree
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int n=arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for(int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while(left < right) {

                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        // Print matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
