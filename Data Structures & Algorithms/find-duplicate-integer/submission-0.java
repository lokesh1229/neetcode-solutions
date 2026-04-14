class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int c[] = new int[n];
        for(int i=0;i<n;i++){
            c[nums[i]]++;
        }
        for(int i=0;i<n;i++){
            if(c[i]>1){
                return i;
            }
        }
        return -1;
    }
}
