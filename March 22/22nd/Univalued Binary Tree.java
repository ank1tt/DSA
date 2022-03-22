/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean helper(TreeNode root, int value){
        if(root == null){
            return true;
        }
        if(root.val != value){
            return false;
        }
        // checking the value of all nodes on the left side.
        boolean left = helper(root.left, value);
        //checking values of all nodes on the right side.
        boolean right = helper(root.right, value);
        
        return left && right;
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return helper(root, root.val);
    }
}Univalued Binary Tree.java
