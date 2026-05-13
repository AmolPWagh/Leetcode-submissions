class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = new String();
        int n1 = word1.length()-1;
        int n2 = word2.length()-1;

        for (int i=0; i<=Math.min(n1,n2); i++){
            ans = ans + word1.charAt(i) + "" + word2.charAt(i);
        }
        if (n1<n2){
            ans+= word2.substring(n1+1);
        }
        else{
            ans+= word1.substring(n2+1);
        }
        return ans;
    }
}