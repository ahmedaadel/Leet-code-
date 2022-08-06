

class Solution {
       
    boolean containsDuplicate(int[] nums) {
        
        HashSet Numbers=new HashSet();
        for (int i=0;i<nums.length;i++){
            if (Numbers.contains(nums[i]))
                return true;
            else
                Numbers.add(nums[i]);
        }
        return false;

    }

}