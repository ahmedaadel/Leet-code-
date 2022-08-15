class Solution {
      Map<Character,Integer> romanVal=new HashMap();

        public Solution() {
            romanVal.put('I', 1);
            romanVal.put('V', 5);
            romanVal.put('X', 10);
            romanVal.put('L', 50);
            romanVal.put('C', 100);
            romanVal.put('D', 500);
            romanVal.put('M', 1000);
        }
    
            public int romanToInt(String s) {
            int res = 0;
            int prevVal = 0;
            for (char c : s.toCharArray()) {
                if (romanVal.get(c) > prevVal) {
                    int total = romanVal.get(c) - prevVal;
                    res -= prevVal;
                    res += total;
                     prevVal = romanVal.get(c);
                    continue;
                }
                prevVal = romanVal.get(c);
                res += romanVal.get(c);

            }
            return res;
        }
}