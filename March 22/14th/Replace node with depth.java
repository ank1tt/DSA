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
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
        replace(root, 0);
		
	}
    public static void replace(TreeNode<Integer> root, int depth){
        if(root == null){
            return ;
        }
        
        root.data = depth;
        for(int i = 0; i < root.children.size(); i++){
            replace(root.children.get(i), depth+1);
        }
    }
	
	
}
