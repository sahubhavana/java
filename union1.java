public static void unionarray(int[] arr1,int[] arr2) {
            Set<Integer> set = new HashSet<>();

            for (int x : arr1) {
                set.add(x);
            }

            for (int x : arr2) {
                set.add(x);
            }

            System.out.println(set);

        }
