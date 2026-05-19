class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++)  sum += nums[i];

        int left = 0, right = k, maxSum = sum;

        while (right < nums.length) {
            sum += nums[right] - nums[left];
            maxSum = Math.max(sum,maxSum);              
            left++; right++;
        }                       
        return (double) maxSum/k;
    }
}