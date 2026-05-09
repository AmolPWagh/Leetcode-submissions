/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution{
    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int s = 0;
        int e = mountainArr.length()-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if (mountainArr.get(mid) > mountainArr.get(mid+1)) e = mid;
            else s = mid+1; 
        }
        return(s);
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int s = 0;
        int e = peak;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mountainArr.get(mid)==target) return mid;
            else if (mountainArr.get(mid)<target) s = mid + 1;
            else e = mid - 1;
        }
        s = peak;
        e = mountainArr.length()-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mountainArr.get(mid)==target) return mid;
            else if (mountainArr.get(mid)<target) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }
}