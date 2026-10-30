class Solution {
    static void solve(int k,int n,int sum,int i,List<Integer>out,List<List<Integer>>ans){
            if(sum==n && out.size()==k){
                ans.add(new ArrayList<>(out));
                return;
            }
            if(i>9||sum>n){
                return;
            }
           
            out.add(i);
            
            solve(k,n,sum+i,i+1,out,ans);
            out.remove(out.size()-1);
          

        solve(k,n,sum,i+1, out, ans);

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
       

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = new ArrayList<>();

        solve(k,n,0,1 ,out, ans);

        return ans;
    }
}
