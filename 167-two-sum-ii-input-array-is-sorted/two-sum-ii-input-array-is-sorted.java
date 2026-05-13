class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for (int i=0; i<numbers.length; i++){
            int req = target - numbers[i];
            if (hm.containsKey(req)){
                ans[0]=(hm.get(req))+1;
                ans[1]=i+1;
                break;
            }
            else{
                hm.put(numbers[i],i);
            }
        }
        return ans;
    }
}