class Solution {

    //using recursion

    // static int helper(int[] nums, int target, int index){
    //     if (index==nums.length) return -1;
    //     if (nums[index]==target)return index;
    //     return helper(nums, target, ++index);
    // }
    // public int search(int[] nums, int target) {
    //     return helper(nums, target, 0);
    // }

    // using iteration
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}