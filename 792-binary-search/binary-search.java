class Solution {

    //using recursion

    static int helper(int[] nums, int target, int s, int e){
        
        if (s>e)return -1;
        int m = s + (e-s)/2;
        if (nums[m]== target) return m;
        else if(nums[m]>target) return helper(nums, target, s, m-1);
        return helper(nums, target, m+1, e);
    }
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    // using iteration
    // public int search(int[] nums, int target) {
    //     int s=0;
    //     int e=nums.length-1;
        
    //     while(s<=e){
    //         int mid = s + (e-s)/2;
    //         if (nums[mid]==target) return mid;
    //         else if (nums[mid]>target) e=mid-1;
    //         else s=mid+1;
    //     }
    //     return -1;
    // }
}