class Solution {
    public int findNumbers(int[] nums) {
        int how = 0;
        for (int num : nums){
            if (noOfDigits(num)%2==0){
                how++;
            }
        }
        return how;
    }

    static int noOfDigits(int num){
        int count = 0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
}