package com.saiparesh.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
		myDoublyLinkedList.insertFirst(10);
		myDoublyLinkedList.insertFirst(30);
		myDoublyLinkedList.insertLast(40);
		myDoublyLinkedList.insertAfter(10, 55);
		myDoublyLinkedList.insertAfter(55, 85);
		myDoublyLinkedList.displayForward();
		myDoublyLinkedList.displayBackward();
		myDoublyLinkedList.deleteFirst();
		myDoublyLinkedList.deleteLast();
		myDoublyLinkedList.displayForward();
		myDoublyLinkedList.deleteKey(55);
		myDoublyLinkedList.displayForward();
	}

}
