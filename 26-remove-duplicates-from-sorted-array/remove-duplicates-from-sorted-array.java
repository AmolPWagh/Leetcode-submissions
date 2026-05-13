class Solution {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int i=1;
        for (int j=i; j<nums.length; j++){
            if(nums[i-1]<nums[j]){
                swap(nums, i, j);
                i++;
            }
        }
        return i;
    }
}