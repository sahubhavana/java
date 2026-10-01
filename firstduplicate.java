public static void  firstduplicate(int[] arr){
    HashMap<Integer,Integer>freq=new HashMap<>();
    for(int num:arr){
        freq.put(num,freq.getOrDefault(num,0)+1);

    }
    for(int key: freq.keySet()){
        if(freq.get(key)>1){
            System.out.print("first duplicate number ="+key);
            break;
        }
    }

}
