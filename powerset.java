static List<List<Integer>> list = new ArrayList<>();

    public static List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        ps(nums, new ArrayList<>(), 0);
        return list;
    }

    public static void ps(int[] nums,ArrayList<Integer> ls2,int i){
        if(i==nums.length){
            list.add(new ArrayList<>(ls2)); // copy add karni hai
            return;
        }
        ls2.add(nums[i]);
        ps(nums,ls2,i+1);
        ls2.remove(ls2.size()-1);
        ps(nums,ls2,i+1);
    }
