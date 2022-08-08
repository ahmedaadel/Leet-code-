class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
        int[] rans=new int[26];
        int[] mag=new int[26];
        
        for(char c: ransomNote.toCharArray())
        {
            rans[c-'a']+=1;
        }
         for(char c: magazine.toCharArray())
        {
            mag[c-'a']+=1;
        }
        
        for(int i=0;i<26;i++)
        {
            if(rans[i]<=mag[i])continue;
            return false;
        }
        return true;
    }
}