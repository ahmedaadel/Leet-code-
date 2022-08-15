class Solution {
         public int lengthOfLongestSubstring(String s) {
            ArrayList<Character> nonRepeted = new ArrayList();
            int max = 0;
             
            for (char c : s.toCharArray()) 
            {
                if (nonRepeted.contains(c))
                {
                    if (nonRepeted.size() > max) max = nonRepeted.size();
                    
                    int x=nonRepeted.indexOf(c);
                    for (int i =0;i<x;i++) nonRepeted.remove(0);
                           

                    nonRepeted.remove((Character)c);
                }
                nonRepeted.add(c);
            }
             max=nonRepeted.size()>max ? nonRepeted.size():max;
            return max;
        }
}