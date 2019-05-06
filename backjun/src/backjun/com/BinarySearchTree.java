package backjun.com;

class TreeNode{
	int data;
	
	TreeNode left;
	TreeNode right;
}

public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, int input)
	{
		TreeNode p = root; // 참조변수
		
		TreeNode newNode = new TreeNode();
		newNode.data = input;
		newNode.right = null;
		newNode.left = null;
		
		if(p == null)
			return newNode;
		
		else if(newNode.data < p.data) {
			p.left = insertKey(p.left, input);
			return p;
		}
		
		else if(newNode.data > p.data) {
			p.right = insertKey(p.right, input);
			return p;
		}
		else
			return p;
	}
	
	public void insertBST(int input)
	{
		root = insertKey(root, input);
	}
	
	public TreeNode searchBST(int input)
	{
		TreeNode p = root;
		while(p != null)
		{
			if(input < p.data)
				p = p.left;
			else if(input > p.data)
				p = p.right;
			else
				return p;
		}
		return p;
	}
	
	public void inorder(TreeNode root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}
	
	
	
	
	
}
