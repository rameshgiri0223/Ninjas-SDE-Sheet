public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int result = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                result = 0;
            }
        }
        return result;
    }
}
