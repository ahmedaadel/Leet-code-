class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal= new ArrayList();
        List<Integer> lst=new ArrayList();
        lst.add(1);
        pascal.add(lst);
        List<Integer> lst2=new ArrayList();
        for(int i=1;i<numRows;i++){  
            System.out.println("done");
            System.out.println(pascal);
            List<Integer> lst3=new ArrayList();
            lst3.add(0,1);
            if(i>=2)
            {
                for (int n=1;n<i;n++)
            {
                lst3.add(n,lst2.get(n)+lst2.get(n-1));
            }
            }
            
            lst3.add(i,1);
            lst2=lst3;
            pascal.add(lst3);
        }
        return pascal;
    }
}