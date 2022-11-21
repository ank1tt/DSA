class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        
        
        // swapping the values.
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        
        // recursion call.
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
