class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int a[] = new int[n];
        Arrays.fill(a,-1);
        for(int i=0;i<n;i++){
             int max = -1;
            for(int j=i+1;j<n;j++){
                max = Math.max(arr[j],max);
            }
            a[i] = max;
        }
        return a;

    }
}