class Solution {
     static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e - s)/2;
            if (arr[m]>arr[m+1]) return m;
            if (arr[m]<arr[m-1]) return m-1;
            if (arr[s] < arr[m]) s = m+1;
            else e = m-1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        if (nums[s]<=nums[e]){
            while(s<=e){
                int mid = s + (e-s)/2;
                if(nums[mid]==target) return mid;
                else if (nums[mid]<target) s = mid+1;
                else e = mid-1;
            }
            return -1;
        }
        else{
            int pivot = findPivot(nums);
            e = pivot;
            while(s<=e){
                int mid = s + (e-s)/2;
                if(nums[mid]==target) return mid;
                else if (nums[mid]<target) s = mid+1;
                else e = mid-1;
            }
            s = pivot+1;
            e = nums.length -1;
            while(s<=e){
                int mid = s + (e-s)/2;
                if(nums[mid]==target) return mid;
                else if (nums[mid]<target) s = mid+1;
                else e = mid-1;
            }
        }
        return -1;
    }
}
