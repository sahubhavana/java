class Solution {
    public int whileLoop(int d) {
        int sum = 0;
        int num = (d == 0) ? 10 : d;
        int count = 0;

        while (count < 50) {
            sum += num;
            num += 10;
            count++;
        }

        return sum;
    }
}
