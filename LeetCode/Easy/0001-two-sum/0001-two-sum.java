class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap <> ();
        for(int i=0; i<nums.length; i++){
            int clt = target - nums[i];
            if(map.containsKey(clt))
                return new int[] {map.get(clt), i};
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}