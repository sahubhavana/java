 60.find first repeating element
       int arr[] = {10, 5, 3, 4, 3, 5, 6};
       Set<Integer> s = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           if (!s.contains(arr[i])) {
               s.add(arr[i]);
           }
           else{
               System.out.print("first repeating element"+arr[i]);
           }

