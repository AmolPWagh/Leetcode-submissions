class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s + (e-s)/2;
            if (arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be ans, but look at left
                // this is why e != mid-1;
                e = mid;
            }
            else{
                // you are in asc part of array
                s = mid+1; // bcuz mid+1 ele >mid ele
            }
        }
        // int the end s==e and pointing to largest element in array
        return(s);
    }
}