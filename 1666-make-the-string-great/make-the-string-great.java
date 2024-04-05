class Solution {
    public String makeGood(String s) {
        int len=s.length();
        int i=0,j=1;
        StringBuilder st=new StringBuilder();
       for(char ch:s.toCharArray())
       {
        if(st.length()> 0 && (ch+32==st.charAt(st.length()-1) || ch-32==st.charAt(st.length()-1)))
        {
            st.deleteCharAt(st.length()-1);
        }
        else st.append(ch);
       }
        return st.toString();
    }
}