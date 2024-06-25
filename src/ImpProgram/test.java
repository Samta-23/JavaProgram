package ImpProgram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.LinkedList;
//count char freq in String
import java.util.*;
//import java.util.
/*p		h		a-z A-Z 4-15 _
 * not start with 0-9  < >
1   sam char same frq*/
// case insensitive anagram checking
class Node{
	int data;
	Node left;
	Node right;
	Node(int n)
	{
		data=n;
		left=null;
		right=null;
	}
	
}
public class test {
	static Node insert(Node root,int n)
	{
		if (root==null)
			return new Node(n);
		Node cur;
		if(n<=root.data)
		{
			cur=insert(root.left,n);
			root.left=cur;
		}
		if (n>root.data)
		{
			cur=insert(root.right,n);
			root.right=cur;
		}
		return root;
	}
	static void inorder(Node root)
	{
		if (root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		
		inorder(root.right);
	}
	static void postorder(Node root)
	{
		if (root== null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
	static void preorder(Node root)
	{
		if (root==null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	static void 
	
		
		public static void main(String []str)
	{
	
			
	}

}
