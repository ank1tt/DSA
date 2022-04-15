// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

class Solution {
    int sum = 0;
    
   public  int value(TreeNode root){
        return(root != null) ? root.val : 0;                 // to check if the value of node is not 0.
    }
    
   public  int answer(TreeNode root){
        if(root == null) return 0;
        
        if(root.val % 2 == 0){            // if grandpa is even
            if(root.left != null){
                sum += value(root.left.left) + value(root.left.right); // if theere is a grandson add his val
            }
            if(root.right != null){
                sum += value(root.right.left) + value(root.right.right); // if there is a right grandson add his val
            }
        }
         
        answer(root.left);                               // traversal left
        answer(root.right);                              // traversal right
        
        return sum;
    }
    public int sumEvenGrandparent(TreeNode root) {
        answer(root);
        return sum;
    }
}
