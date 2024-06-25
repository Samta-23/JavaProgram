package pck;
import java.util.*;

 class Node{
	int data;
	Node left, right;
	Node(int n)
	{
		data=n;
		left=null;
		right=null;
	}
}

public class BinarySearchTree {
	
	public static Node insert(Node root, int data)
	{
		if (root==null)
			return new Node(data);
		else
		{
			Node cur;
			if(data<= root.data)
			{
				cur=insert(root.left,data);
				root.left=cur;
			}
			else
			{
				cur=insert(root.right,data);
				root.right=cur;
			}
		}
		return root;
	}
	public static void preorder(Node root)
	{
		if (root==null)
		{
			return;
		}
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
				
	}
	public static void postorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	public static void inorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);
		System.out.println(root.data);
		postorder(root.right);
		
	}
	public static void main(String []str)
	{
		Node root=null;
		int no_node, data;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of nodess");
		no_node=sc.nextInt();
		while(no_node-->0)
		{
			System.out.println("Enter data for nodess");
			data=sc.nextInt();
			root=insert(root,data);
		}
		sc.close();
		//System.out.println("out put in preorder "  );
		//preorder(root);
		//System.out.println("out put in postorder "  );
		//postorder(root);
		System.out.println("out put in inorder "  );
		inorder(root);
		
	}

}
