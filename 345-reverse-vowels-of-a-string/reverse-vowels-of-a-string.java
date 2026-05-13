class Solution {
    static void swap( char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if (!isVowel(arr[i])) {
                i++;
            }
            else if (!isVowel(arr[j])) {
                j--;
            }
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}