class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans = new int[n];
        if (k==0){
            return ans;
        }
        if (k>0){
            int sum=0;
            for (int i=1; i<=k; i++){
                sum += code[i];
            }
            ans[0] = sum;
            for (int i=1; i<n; i++){
                sum += code[(i+k)%n] - code[i];
                ans[i] = sum;
            }
        } else if (k<0) {
            k=-k;
            int sum=0;
            for (int i=n-1; i>=n-k; i--){
                sum += code[i];
            }
            ans[0] = sum;
            for (int i = 1; i < n; i++) {
                sum -= code[(n-k+i-1)%n];
                sum += code[i-1];
                ans[i] = sum;
            }
        }
        return ans;
    }
}   