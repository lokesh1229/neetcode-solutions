class Solution {
    public boolean isPalindrome(String s) {
        String x = s.toLowerCase().trim().replaceAll("[^A-Za-z0-9]","");
        if(s==null || s.length()==1 ) {
            return true;
        }

        int i=0;
        int j=x.length()-1;
        while(i<j){
            if(x.charAt(i)!=x.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
