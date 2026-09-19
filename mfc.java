class Solution {
    public int whileLoop(int d) {
        int sum = 0;
        int i = 1;

        while (i <= 50) {
            sum += (i - 1) * 10 + d;
            i++;
        }

        return sum;
    }
}