class Solution {
    public boolean isArmstrong(int n) {
         int original =n;
         int temp=n;
         int digit=0;
         while(n>0){
            n=n/10;
            digit++;
         }
         int sum=0;
         while(temp>0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
         }
        return sum == original;
    }
}
