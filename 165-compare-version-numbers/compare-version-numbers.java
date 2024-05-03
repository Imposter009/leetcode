class Solution {
    public int compareVersion(String version1, String version2) {
        String []v1=version1.split("\\.");
        String []v2=version2.split("\\.");
        int i=0;
        int s1,s2;
        while(i< v1.length || i< v2.length ){
                if(i<v1.length)s1=Integer.parseInt(v1[i]); else  s1=0;
                if(i<v2.length)s2=Integer.parseInt(v2[i]); else  s2=0;
            
            if(s1<s2) return -1;
            if(s2<s1) return 1;
            if(s1==s1)i++;
        }
return 0;
    }
}