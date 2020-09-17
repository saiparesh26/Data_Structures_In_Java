package com.saiparesh.singlelinkedlist;

public class SinglyLinkedList {
	private Node first;
//	private Node last;
	
	public SinglyLinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		current.next = newNode;	
	}
	
	public void displayList() {
		Node current = first;
		while (current != null) {
			System.out.print(current.data);
			if(current.next != null) {				
				System.out.print("-->");
			} 
			current = current.next;
		}
	}
}
