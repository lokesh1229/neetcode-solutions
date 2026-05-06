public class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<= n - k;i++){
            int max = nums[i];
            int min = nums[i];
            for(int j=i;j<i + k;j++){
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
            }
            minDiff = Math.min(minDiff, (max - min));
        }
        return minDiff;
    }
}