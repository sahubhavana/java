 50.Print frequency of every element

    int arr[]={5,2,3,2,3,1,2,9};
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int num:arr){
        mp.put(num,mp.getOrDefault(num,0)+1);
    }
    System.out.print(mp);
