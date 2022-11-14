package com.greatLearning.client;

import com.greatLearning.service.*;

public class driver extends BSTConversion {

	public static void main(String[] args) {

		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);

		rightSkewed(node);
		traverseRightSkewed(headNode);

	}

}
