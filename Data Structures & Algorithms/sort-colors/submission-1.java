class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zc = 0;
        int oc = 0;
        int tc = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zc++;
            }else if(nums[i]==1){
                oc++;
            }else{
                tc++;
            }
        }
        for(int i=0;i<zc;i++){
            nums[i] = 0;
        }
        for(int i=zc;i<n-tc;i++){
            nums[i] = 1;
        }
        for(int i=zc+oc;i<n;i++){
            nums[i] = 2;
        }
    }
}