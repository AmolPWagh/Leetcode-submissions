class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int n = num;
        int window = (int)Math.pow(10,k);
        int limit = window/10;
        while (n >= limit){
            int div = n % window;
            if (div != 0 && num % div == 0) count++;
            n /= 10;
        }
        return count;
    }
}