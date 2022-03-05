class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
            ArrayList<Boolean> ans = new ArrayList<Boolean>();
            int a = maxFinder(candies);
            
            for(int i = 0; i < candies.length; i++){
                    if(candies[i] + extraCandies >= a){
                            ans.add(true);
                    }else{
                            ans.add(false);
                    }
            }
            return ans;
            
            
    }
        public static int maxFinder(int[] arr){
                int max = arr[0];
                for(int i = 1; i < arr.length; i++){
                        if(arr[i] > max){
                                max = arr[i];
                        }
                }
                return max;
        }
}
