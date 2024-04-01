class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        int c=0;
        int j=s.length();
       for(int i=0;i<arr[arr.length-1].length();i++)
        {
            c++;
        }
    
    return c;
    }
}