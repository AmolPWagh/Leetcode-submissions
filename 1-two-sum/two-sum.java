class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for (int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if (hm.containsKey(req)){
                ans[0]=(hm.get(req));
                ans[1]=i;
                break;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}