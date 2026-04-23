29. 3Sum of array element
       int nums[] = {2, -2, 0, 3, -3, 5};
       Set<List<Integer>> st = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               for (int k = j + 1; k < nums.length; k++) {
                   if (nums[i] + nums[j] + nums[k] == 0) {
                       List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                       Collections.sort(temp);
                       st.add(temp);

                   }
               }

           }
       }
       int[] arr = new int[st.size()];
       int i = 0;
       for (int x : st) {
           arr[i++] = x;
       }
       for (int j = 0; j < arr.length; j++) {
           System.out.print(arr[j] + " ");
       }
