class Solution {
    public String maximumOddBinaryNumber(String s) {
        int c=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='1') c++;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<c;i++)
        {
            sb.append("1");
        }
        for(int i=0;i<l-c;i++)
        {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}
/*
Notes:
odd number ke bindary value me last me 1 hoga for sure.
even number ke bindary value me last me 0 hoga for sure.
max odd number with n number of 1 wo hoga jisme last me ek 1 hoga aur baaki saare 1 starting me honge aur beech ki space me  honge.
max even with n number of   wo hoga jisme saare  starting me ho aur uske baad saare .
*/