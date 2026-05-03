class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i=0; i<accounts.length; i++){
            int currWealth = 0;
            for (int j: accounts[i]){
                currWealth += j;
            }
            maxWealth = Math.max(currWealth, maxWealth);
        }
        return maxWealth;
    }
}