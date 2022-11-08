package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
	ArrayList<Integer> nodelist = new ArrayList<>();

	private static Node Newnode(int n) {
		Node temp = new Node();
		temp.left = null;
		temp.key = n;
		temp.right = null;

		return temp;

	}

	private void insert(Node root, Node newnode) {
		if (newnode.key < root.key) {
			if (root.left == null) {
				root.left = newnode;
			} else {
				insert(root.left, newnode);
			}
		} else {
			if (root.right == null) {
				root.right = newnode;
			} else {
				insert(root.right, newnode);
			}
		}
	}

	private void Inorder(Node root) {
		if (root != null) {
			Inorder(root.left);
			nodelist.add(root.key);
			Inorder(root.right);
		}

	}

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		Node root = null;
		Node newnode = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Node's you want to have");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the Data for the Node");
			int n = sc.nextInt();
			newnode = Newnode(n);
			if (root == null) {
				root = newnode;
			} else {
				BST.insert(root, newnode);

			}
		}
		BST.Inorder(root);

		System.out.println(BST.nodelist);

		System.out.println("Enter the Sum");
		int Sum = sc.nextInt();
		int flag = 0;
		
			for (int j = 0; j < BST.nodelist.size(); j++) {
				int n1 = BST.nodelist.get(j);
				int n2 = Sum - n1;
				if (BST.nodelist.contains(n2)) {
					System.out.println("The combination have been found");
					System.out.println("The pair is"+" "+"["+n1 + "," + n2+"]");
					flag = 1;
					break;

				}}
				if (flag == 0) {
					System.out.println("Failed to find the pair");
				
				}}
			

		}
	

