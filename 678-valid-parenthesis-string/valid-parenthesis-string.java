class Solution {
    public boolean checkValidString(String s) {
        int len=s.length();
        Stack<Integer>st=new Stack<>();
        Stack<Integer>sr=new Stack<>();

        int c=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(') st.push(i);
            if(ch=='*') sr.push(i);
            if(ch==')')
            {
                if(!st.isEmpty()) st.pop();
                else{
                    if(sr.size()==0) return false;
                    else sr.pop();
                } 
            }
        }
        while(!st.isEmpty() && !sr.isEmpty())
        {
            if(sr.peek()>st.peek()){st.pop();
            sr.pop();
            }
            else return false;
        }
        return (st.isEmpty());
    }
}