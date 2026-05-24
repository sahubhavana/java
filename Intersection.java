
//  46.Print array Intersection element
       int arr[] = {1, 2, 3, 4, 5};
       int arr1[] = {2, 5, 6, 7, 8};
       HashSet<Integer> a = new HashSet<>();
       HashSet<Integer> a1 = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           a.add(arr[i]);

       }
       for (int i = 0; i < arr1.length; i++) {
           if (a.contains(arr1[i])) {
               a1.add(arr1[i]);
               a.remove(arr1[i]);
           }
       }
           System.out.print(a1);
