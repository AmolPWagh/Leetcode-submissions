class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = n -1;
        int[] ans = new int[n];
        int k = 1;
        while(i<=j){
            int iSq = nums[i]*nums[i];
            int jSq = nums[j]*nums[j];
            if (iSq > jSq){
                ans[n-k] = iSq;
                i++;
            }
            else{
                ans[n-k] = jSq;
                j--;
            }
            k++;
        }
        return ans;
    }
}