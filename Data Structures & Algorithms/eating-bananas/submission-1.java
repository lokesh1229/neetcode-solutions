class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int n = piles.length;
        int low = 1;
        int high = max;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(sumOfBananasPerHr(piles,mid)<=h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int sumOfBananasPerHr(int nums[],int x){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/(double)x);
        }
        return sum;
    }
}
