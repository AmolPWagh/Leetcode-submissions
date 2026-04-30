class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<=1) return true;
        int s=1; int e=num/2;
        
        while(s<=e){
            int mid = s + (e-s)/2;
            if (num/mid == mid && num%mid ==0)return true;
            else if(num/mid <mid) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
}