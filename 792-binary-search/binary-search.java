class Solution {

    static int helper(int[] nums, int target, int index){
        if (index==nums.length) return -1;
        if (nums[index]==target)return index;
        return helper(nums, target, ++index);
    }
    public int search(int[] nums, int target) {
        return helper(nums, target, 0);
    }
}