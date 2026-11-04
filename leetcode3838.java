class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();;
        for(String x:words){
            int weig=0;
            for(int i=0;i<x.length();i++){
                int s=x.charAt(i)-'a';
                weig=weig+weights[s];
            }
            int rem = weig % 26;

            char mapped = (char)('z' - rem);

            ans.append(mapped);

        }
        return ans.toString();
    }
}
