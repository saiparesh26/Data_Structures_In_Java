package com.saiparesh.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		
		SinglyLinkedList mySinglyLinkedList = new SinglyLinkedList();
		mySinglyLinkedList.insertFirst(88);
		mySinglyLinkedList.insertFirst(99);
		mySinglyLinkedList.insertFirst(10);
		mySinglyLinkedList.insertFirst(20);
		mySinglyLinkedList.insertLast(30);
		mySinglyLinkedList.insertLast(40);
		mySinglyLinkedList.displayList();
	}

}
