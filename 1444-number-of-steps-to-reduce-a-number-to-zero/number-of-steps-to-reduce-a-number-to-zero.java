class Solution {
    static int helper (int num, int count){
        if (num == 0) return count;
        if (num%2==0) return helper(num/2,++count);
        else return helper(--num,++count);
    }
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
}