class Solution {

    //using iteration

    // public int numberOfSteps(int num) {
    //     int count = 0;
    //     while(num>0){
    //         if(num%2==0){
    //             num=num/2;
    //             count++;
    //         }
    //         else{
    //             num--;
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    //using recursion
    static int helper (int num, int count){
        if (num == 0) return count;
        if (num%2==0) return helper(num/2,++count);
        else return helper(--num,++count);
    }
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
}