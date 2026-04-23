27.union of two arrays
       int nums1[] = {1, 2, 3, 4, 5};
       int nums2[] = {1, 2, 7};
       Set<Integer> set1 = new HashSet<>();

       for (int x : nums1) {
           set1.add(x);
       }
       for (int x : nums2) {
           set1.add(x);
       }
       int[] arr = new int[set1.size()];
       int i = 0;
       for (int x : set1) {
           arr[i++] = x;
       }
       for (int j= 0; j < arr.length; j++) {
           System.out.print(arr[j]+" ");

       }
