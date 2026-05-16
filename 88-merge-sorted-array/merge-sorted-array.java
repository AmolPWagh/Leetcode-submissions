class Solution {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n==0) return;
        int curr = nums1.length-1;
        m = --m; n = --n;
        while (m>=0 && n>=0){
            if (nums1[m] <= nums2[n]){
                nums1[curr] = nums2[n];
                n--;
                curr--;
            }
            else{
                nums1[curr] = nums1[m];
                m--;
                curr--;
            }
        }
        if ( n>=0){
            for (int i=0; i<=n; i++){
                nums1[i] = nums2[i];
            }
        }
    }
}