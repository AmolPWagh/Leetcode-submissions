class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[] {-1,-1};
        int s = 0;
        int e = nums.length-1;
        int first = 0;
        int last = 0;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]>=target) e=mid-1;
            else s=mid+1;
        }
        first = s;
        if (first == nums.length || nums[first]!=target) return new int[] {-1,-1};

        s=0;
        e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if (nums[mid]<=target) s=mid+1;
            else e=mid-1;
        }
        last = e;

        return new int[] {first,last};
    }
}