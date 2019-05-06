package backjun.com;

public class BinarySearchTree_Main {
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST(5);
		bst.insertBST(1);
		bst.insertBST(3);
		bst.insertBST(6);
		bst.insertBST(7);
		bst.insertBST(2);
		bst.insertBST(4);
		bst.insertBST(8);
		
		System.out.print("이진 트리 값 : ");
		bst.printBST();
		
		System.out.println("이진트리 탐색 시작");
		TreeNode p1 = bst.searchBST(7);
		
		if(p1 != null)
			System.out.println("탐색 성공 : "+p1.data);
		else
			System.out.println("탐색 실패 데이터가 존재하지 않는다.");
		
	}
}
