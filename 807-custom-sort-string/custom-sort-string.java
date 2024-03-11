class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> l=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            l.put(ch,l.getOrDefault(ch,0)+1);
            // storing the frequency of each char of s
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
             char ch=order.charAt(i);
            if (!l.containsKey(ch)) {
                continue;
            }
        // ho sakte hai ki order me koi aise char ho jo s me nhi the to jab unki freq nikalenge to null dega, usi ko avoid karne ke liye ye if condition lagaya hai
           int c=l.get(ch);
           while(c>0)
           {
               ans.append(ch);
               c--;
           }
           l.remove(ch);
        //    order string ke hisaab se saare character laga rahe hai jo s aur order me common hai
        //  while loop isliye taaki agar koi character repeat ho raha ho agar s me to sb saath me a jayega(frequency isliye nikali thi)
        // add karne ke baad wo wala character hum map se hata de rahe hai taaki baad me pata rahe ki kon kon se character last me add karne hai
        }
        for(Character key: l.keySet())
        {
            // bache hue baaaki characters ko last me add kr rahe
            int c=l.get(key);
            while(c>0)
            {
            ans.append(key);
            c--;
            }
        }
        return ans.toString();
    }
}