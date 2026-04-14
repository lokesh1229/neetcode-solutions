class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for(int i:nums){
            if(hs.contains(i)){
                ans = i;
            }
            hs.add(i);
        }
        return ans;
    }
}
