class Solution {
         public int[] twoSum(int[] nums, int target) {
        int Findex=0,Sindex=0;
           HashMap<Integer,Integer> Numbers=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++)
        {
            int tarremain=target-nums[i];
            if(Numbers.containsKey(tarremain))
            {
                Findex=Numbers.get(tarremain);
                Sindex=i;
                break;
            }
            Numbers.put( nums[i],i);
        }   
        int[] res={Findex,Sindex};
        return res;
    }
}