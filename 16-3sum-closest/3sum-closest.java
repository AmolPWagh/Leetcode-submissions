class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i=0; i<nums.length-2; i++){
            if (i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int currSum = nums[i] + nums[j] + nums[k];
                int sumDiff = Math.abs(sum-target);
                int currSumDiff = Math.abs(currSum-target);
                if (sumDiff > currSumDiff) sum = currSum;

                if (currSum < target)  j++;
                else if (currSum > target) k--;
                else{
                   return  currSum;
                }
            }
        }
        return sum;
    }
}