class Solution {
    public boolean isAnagram(String s, String t) {
            
        int[] ss=new int[26];
        int[] tt=new int[26];
        
        for(char c: s.toCharArray())
        {
            ss[c-'a']+=1;
        }
         for(char c: t.toCharArray())
        {
            tt[c-'a']+=1;
        }
        
        for(int i=0;i<26;i++)
        {
            if(tt[i]==ss[i])continue;
            return false;
        }
        return true;
    
    }
}