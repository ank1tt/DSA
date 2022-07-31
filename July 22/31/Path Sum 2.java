class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        pathfinder(root, targetSum, res, ans , 0);
        return res;
    }
    
    public void pathfinder(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> ans , int sum){
        if(root == null){
            return;                              // base case.
        }
        
        ans.add(root.val);            // sum value to keep track of the value of sums.
        sum+= root.val;
        
        if(root.left == null && root.right == null && sum == targetSum){   // if the node is a leave and the sum is equal to target we found a path.
            res.add(new ArrayList<>(ans));
        }
        pathfinder(root.left, targetSum, res, ans, sum);
        pathfinder(root.right, targetSum, res,ans , sum);
        
        ans.remove(ans.size()-1);         // backtracking.
        sum-= root.val;
    }
}


https://leetcode.com/problems/path-sum-ii/
