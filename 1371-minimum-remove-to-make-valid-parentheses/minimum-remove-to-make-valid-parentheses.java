class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        int len=s.length();
          StringBuilder str=new StringBuilder(s);
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')st.push(i);
            else if(ch==')' && !st.isEmpty()) st.pop();
            else if(ch==')' && st.isEmpty()) str.setCharAt(i,'&');
        }
      while(!st.isEmpty())
      {
        int j=st.pop();
        str.setCharAt(j,'&');
      }
        return str.toString().replaceAll("&","");
    }
}