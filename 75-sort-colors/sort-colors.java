class Solution {
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
}
    public void sortColors(int[] nums) {
        // Dutch National Flag Algo
        int start = 0;
        int end = nums.length -1;
        int curr =0;
        while (curr <= end){
            if(nums[curr] == 0){
                swap(nums, curr, start);   
                start++;
                curr++;
            }
            else if(nums[curr] == 2){
                swap(nums, curr, end);
                end--;
            }
            else curr++;
        }
        
    }
}