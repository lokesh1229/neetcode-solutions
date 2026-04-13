class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int res = 0;
        for(int j=0;j<n;j++){
            while(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(s.charAt(j));
            res = Math.max(res,j-i+1);
        }
        return res;

    }
}
