class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        // 1st pointer at the end of the 1st array and 2nd pointer at the end of the 2nd array.
        // 3rd pointer at the end of the 1st array before zeroes.
        for(int i = m+n-1, a = m-1, b = n-1; i>=0 && b>=0; i--){
            // if the 2nd array value is greater than the 1st then we move it with the zeroes
            // else if the 1st array has greater value we move it to the end.
            if(a >= 0 && nums1[a] > nums2[b]) nums1[i] = nums1[a--];
            else nums1[i] = nums2[b--];
        }
        
    }
}
