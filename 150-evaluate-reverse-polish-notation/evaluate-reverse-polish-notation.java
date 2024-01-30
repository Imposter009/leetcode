class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int n= tokens.length;
        if(n==1)return Integer.parseInt(tokens[0]);
        int ans=0;
        for(int i=0;i<n;i++)
        {
        String str=tokens[i];
        int len=str.length();

        char cx=str.charAt(0);
        if(Character.isDigit(cx) || len>1)
        s.push(Integer.parseInt(str));
       
        else if(len==1 && (cx=='*' || cx=='+'||cx=='/'||cx=='-'))
        {
            int q=s.pop();
            int w=s.pop();
            switch(cx){
            case '+':{ans=q+w; s.push(ans);break;}
            case '-':{ans=w-q; s.push(ans);break;}
            case '/':{ans=w/q; s.push(ans);break;}
            case '*':{ans=w*q; s.push(ans);break;}
        } }
    }return ans;
    }
}