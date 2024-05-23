class Solution {
boolean  isbSubset(List<Integer> ls, int k){
        Set<Integer>s=new HashSet<>();
        for(int i: ls){
            // key point here is ki k-i ke liye check karenge pr saath hi saath k+i ke lye bhi check krna padega kyuki ho sakta hai ki present i= 4 ho aur hamare set me 6 already ho to us case me bhi diff 2(i.e k) ke barabar a jayega
if(s.contains((k-i)*-1)|| s.contains(Math.abs(k+i)))  return false;
        else s.add(i);
        }
        return true;
    }
    public int beautifulSubsets(int[] nums, int k) {
        int c=0;
        int l=nums.length;
        for(int i=1;i<(Math.pow(2,l));i++){
            List<Integer>ls=new ArrayList<>();
            for(int j=0;j<l;j++){
                if(((1<<j)&i)!=0) ls.add(nums[j]);
            }
            if(isbSubset(ls, k)) {c++;}
        }
        return c;
    }
}