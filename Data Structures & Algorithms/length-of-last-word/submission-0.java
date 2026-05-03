class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        String x = arr[arr.length - 1];
        return x.length();
    }
}