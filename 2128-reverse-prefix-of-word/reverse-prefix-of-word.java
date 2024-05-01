class Solution {
    public String reversePrefix(String word, char ch) {
        int inx=word.indexOf(ch);
        StringBuilder s=new StringBuilder();
        s.append(word.substring(0,inx+1));
        s=s.reverse();
        s=s.append(word.substring(inx+1));
        return s.toString();
    }
}