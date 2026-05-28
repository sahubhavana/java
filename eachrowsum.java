//  65.Print Sum of Each Row In 2d Array
       int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       ArrayList<Integer> l = new ArrayList<>();
       int k = 0;
       for (int i = 0; i < arr.length; i++) {
           int sum=0;
           for (int j = 0; j < arr.length; j++) {
               sum =sum+arr[j][k];

           }
           l.add(sum);
           k++;
       }
       System.out.print(l);
