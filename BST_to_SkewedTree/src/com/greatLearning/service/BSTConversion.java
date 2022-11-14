package com.greatLearning.service;

public class BSTConversion {

	public static Node node;
	public static Node tempNode = null;
	public static Node headNode = null;

	public static void rightSkewed(Node root) {
		if (root == null) {
			return;
		}

		rightSkewed(root.left);

		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			tempNode = root;
		} else {
			tempNode.right = root;
			root.left = null;
			tempNode = root;
		}

		rightSkewed(rightNode);
	}

	public static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);
	}

	public static class Node {
		int key;
		public Node left, right;

		public Node(int data) {
			key = data;
			left = right = null;
		}
	}

}
