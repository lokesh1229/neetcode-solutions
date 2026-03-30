class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int a[] = new int[n+n];
        int k = 0;
        for(int i=0;i<n;i++){
            a[k++] = nums[i];
        }
        for(int i=0;i<n;i++){
            a[k++] = nums[i];
        }
        return a;

    }
}