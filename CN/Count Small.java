public class Solution {
    
    public static int[] countS(int n, int m, int []a, int []b) {
        
        int arr[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] >= b[j]) {
                    count++;
                }
            }
         /*()   for (int k = 0; k <= n; k++) {
                arr[n] = count;*/
                arr[i]=  count;
            }
            return arr;
        }
      
    
}
