class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mod = 1_000_000_007;
        int[] pow = new int[n];
        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }
        int count = 0;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                count = (count + pow[j - i]) % mod;
                i++;
            }
            else {
                j--;
            }
        }
        return count;
    }
}