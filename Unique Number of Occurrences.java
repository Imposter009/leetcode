import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> a=new HashMap<>();
        Set<Integer> b=new HashSet<>();
        for(int i: arr)
        {
            a.merge(i,1,Integer::sum);
        }
        
        for(int i: a.keySet())
        {
            if(!b.contains(a.get(i))) b.add(a.get(i));
            else return false;
        }
        return true; 
    }
}