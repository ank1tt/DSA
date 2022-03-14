
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root == null){
            return null;
            
        }
        // sum of the root.
        int sumRoot = sum(root);
        // assuming a max value.
        int max = Integer.MIN_VALUE;
        
        TreeNode<Integer> maxNode = null;
        
        for(int i = 0; i < root.children.size(); i++){
           // new Node to traverse on the childrn Nodes
            TreeNode<Integer> maxNode1 = maxSumNode(root.children.get(i));
            // calling sum on that node.
            int sum = sum(maxNode1);
            // if sum is greater than max updating the maxNode value.
            if(max  < sum){
                max = sum;
                maxNode = maxNode1;
            }
        }
        // checking if sum of root is greater than maxNode if true we return root.
        if(sumRoot > max){
            return root;
        }
        return maxNode;
	}
    // sum function to calculate the sum of the Node.
    public static int sum(TreeNode<Integer> root){
        
        if(root == null){
            return 0;
        }
        int s = root.data;
        for(int i = 0; i < root.children.size(); i++){
            s+=root.children.get(i).data;   
        }
        
        return s;
    }
	
		
}
