class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int m = 1;
        for(int i:nums){
            if(i>0 && m==i){
                m++;
            }
        }
        return m;
    }
}