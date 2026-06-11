class Solution {
    public List<Integer> grayCode(int n) {
        int num = 1<<n;
        ArrayList<Integer>lt= new ArrayList<>();
        for(int i=0;i<num;i++){
            
            
                lt.add((i^(i>>1)));
           
        }
        return lt;
    }
}
