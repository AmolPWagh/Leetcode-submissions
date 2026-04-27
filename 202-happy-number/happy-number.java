class Solution {
    // public static int sumOfSquares(int num){
    //     if(num==0) return 0;
    //     int m = num%10;
    //     return m*m + sumOfSquares(num/10);
    // }

    public static int sumOfSquares(int num){
        int ans = 0;
        while(num>0){
            int m = num%10;
            num = num/10;
            ans += m*m;
        }
        return ans;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do{
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
            if (fast == 1){
                return true;
            }
        }
        while(slow!=fast);

        return false;
    }
}