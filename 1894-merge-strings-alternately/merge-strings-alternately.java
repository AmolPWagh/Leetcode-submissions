class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length()-1;
        int n2 = word2.length()-1;

        for (int i=0; i<=Math.min(n1,n2); i++){
            sb.append(word1.charAt(i)); 
            sb.append(word2.charAt(i));
        }
        if (n1<n2){
            sb.append(word2.substring(n1+1));
        }
        else{
            sb.append(word1.substring(n2+1));
        }
        return sb.toString();
    }
}