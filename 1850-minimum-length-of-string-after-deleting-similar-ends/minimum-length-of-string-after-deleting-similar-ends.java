class Solution {
    public int minimumLength(String s) {
     int len=s.length();
     int i=0;
     int j=len-1;
     while(i<j && s.charAt(i)==s.charAt(j))
     {
         char ch=s.charAt(i);
         while(i<=j &&s.charAt(i)==ch)
         {
             i++;
         }
         while(j>=i && s.charAt(j)==ch)
         {
            j--;
         }
     }
     return j-i+1;   
    }
}
//inner loop me we are using equal too bec in case of string like"cabaabac" jab wo inner a pr ayega i.e index 3 to wo usko increment kar ke 4 kr dega to agla while loop chale isliye we use equal to.
