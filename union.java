53.Print union or two array
        int arr1[]={1,2,3,4,5,6,7};
        int arr2[]={2,3,4,9,10,11,12};
        HashSet<Integer> u=new HashSet<>();
        for(int num:arr1){
            u.add(num);
        }
        for(int num:arr2){
            u.add(num);
        }
        System.out.print(u);

