class Solution {
    public  char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        int mid=0;

        while(s<=e){
            mid = (s+ (e-s)/2)%letters.length;
            if (target == letters[mid]) {
                break;
            }
            else if (target < letters[mid]) e = mid-1;
            else s = mid+1;
        }
        if (target == letters[mid]){
            while (target == letters[(mid+1)%letters.length]){
                mid =(mid+1)%letters.length;
            }
            return letters[(mid+1)%letters.length];
        }
        return letters[s%letters.length];
    }
}
