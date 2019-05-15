package may14th;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public Node insertData(Node root,int data){
		if(root==null){
			System.out.println("called");
			root=new Node(data);
			return root;
		}
		else if(root.data<data){
			root.right=insertData(root.right, data);
		}
		else
			root.left=insertData(root.left, data);
		return root;
	}
	public void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public void levelOrderTraversal(Node root){
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		while(!q.isEmpty()){
			Node temp=q.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	public int findLevel(Node root){
		
		if(root==null)
			return 0;
		
		int leftSide=findLevel(root.left);
		
		int rightSide=findLevel(root.right);
		
		if(leftSide>rightSide){
			return leftSide+1;
		
		}
		else
			return rightSide+1;
	}
	
	public void rightHandView(Node root){
		
	}
	
	
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		Node node=new Node(100);
		bt.insertData(node, 60);
		bt.insertData(node, 120);
		bt.insertData(node, 150);
		bt.insertData(node, 10000);
		System.out.println();
		bt.inorder(node);
		System.out.println();
		bt.levelOrderTraversal(node);
		
		System.out.println(bt.findLevel(node));
	}
}