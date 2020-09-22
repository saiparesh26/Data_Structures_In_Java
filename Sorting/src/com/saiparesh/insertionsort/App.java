package com.saiparesh.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] array = InsertionSort.insertionSort(new int[] {9,8,23,54,12,5,88,34,23});
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
