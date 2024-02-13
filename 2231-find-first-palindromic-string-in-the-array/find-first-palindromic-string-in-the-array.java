class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(palin(words[i])) return words[i];
        }
        return "";
    }
    public boolean palin(String s)
    {
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
}