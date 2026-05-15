class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int i = 0;
        int j = tokens.length -1;
        int maxScore = 0;
    
        while(i<=j){
            if (tokens[i]<=power){
                power -= tokens[i];
                i++;
                score++;
            }
            else if(score >=1){
                power += tokens[j];
                j--;
                score--;
            }
            else {
                i++;
                j--;
            }
            maxScore = Math.max(score, maxScore);
        }
        return maxScore;
    }
}