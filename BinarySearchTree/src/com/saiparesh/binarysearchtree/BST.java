package com.saiparesh.binarysearchtree;

public class BST {

	private Node root;
	
	public void insert(int key, String value) {
		
		Node newNode = new Node(key, value);
		if(root == null) {
			root = newNode;
		}
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(key < current.key) {
					current = current.leftChild;
					if(current == null) {  // It's parent is leaf node
						parent.leftChild = newNode;
						return;
					}
				}
				else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node findMin() {
		Node current = root;
		Node last = null;
		
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node findMax() {
		Node current = root;
		Node last = null;
		
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public boolean remove(int key) {
		Node current = root;
		
		Node parent = root;
		
		boolean isLeftChild = false;
		
		// Searching to find the node with the key to delete
		while(current.key != key) {
			parent = current;
			if(key < current.key) {
				isLeftChild = true;
				current = current.leftChild;
			}
			else {
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null) {
				return false;
			}
		}
		
		// found the node
		Node nodeToDelete = current;
		
		//if node is a leaf
		if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null) {
			if(nodeToDelete == root) {
				root = null;
			}
			else if (isLeftChild) {
				parent.leftChild = null;
			}
			else {
				parent.rightChild = null;
			}
		}
		// if node has one child that is on the left
		else if (nodeToDelete.rightChild == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.leftChild;
			}
			else if (isLeftChild) {
				parent.leftChild = nodeToDelete.leftChild;
			}
			else {
				parent.rightChild = nodeToDelete.leftChild;
			}
		}
		// if node has one child that is on the right
		else if (nodeToDelete.leftChild == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.rightChild;
			}
			else if (isLeftChild) {
				parent.leftChild = nodeToDelete.rightChild;
			}
			else {
				parent.rightChild = nodeToDelete.rightChild;
			}
		}
		
		//if node has 2 child
		else {
			Node successor = getSuccessor(nodeToDelete);
			
			// connect parent of nodeToDelete to successor
			if(nodeToDelete == root) {
				root = successor;
			}
			else if (isLeftChild) {
				parent.leftChild = successor;
			}
			else {
				parent.rightChild = successor;
			}
			successor.leftChild = nodeToDelete.leftChild;
		}
		return true;
	}

	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		
		Node current = nodeToDelete.rightChild;  // go to right child
		while(current != null) {  // start going to left
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor != nodeToDelete.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToDelete.rightChild;
		}
		return successor;
	}
}
