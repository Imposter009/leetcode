class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int maxscore=0;
        int i=0;
        int n=tokens.length;
         while(i<=n-1) {
        if(power>=tokens[i])
        {
         score++;
         maxscore=Math.max(maxscore,score);
         power-=tokens[i];
         i++;
        }
        else if(score>=1)
        {
            score--;
            power+=tokens[n-1];
            n--;
        }
        else return maxscore;
        }
    
    return maxscore;
    }
}