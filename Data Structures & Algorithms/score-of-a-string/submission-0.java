class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++){
            int x = s.charAt(i);
            int y = s.charAt(i+1);
            sum+=Math.abs(x-y);
        }
        return sum;
    }
}