class Solution {
       public boolean isValid(String s) {
           
            Stack<Character> chr=new Stack<>();
            for (char c: s.toCharArray())
            {
                switch (c) {
                    case '(':
                    case '{':
                    case '[':
                        chr.push(c);
                        break;
                    case ')':
                         if(chr.empty())
                             return false;
                        if(chr.lastElement()== '(')
                            chr.pop();
                        else 
                            chr.push(c);
                        break;
                    case ']':
                        if(chr.empty())
                             return false;
                        if(chr.lastElement()== '[')
                            chr.pop();
                         else 
                            chr.push(c);
                        break;
                    case '}':
                         if(chr.empty())
                             return false;
                        if(chr.lastElement()== '{')
                            chr.pop();
                         else 
                            chr.push(c);
                        break;
                    default:
                        break;
                }
                
            }
            
            if(chr.empty())
                return true;
            return false;
        }
}