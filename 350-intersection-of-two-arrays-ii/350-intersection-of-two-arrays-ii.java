class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
        
          ArrayList<Integer> list = new ArrayList<>();
    
        int resctr=0,i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                list.add(nums1[i]);
                        
                i++;j++;
            }
            else if(nums1[i]>nums2[j])
                j++;
            else 
                i++;
            
        }
        int[] res = new int[list.size()];
        for(int b=0;b<list.size();b++){
        res[b] = list.get(b);
             }
        
       
        return res;
        
    }
}