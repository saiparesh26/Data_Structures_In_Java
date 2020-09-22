package com.saiparesh.insertionsort;

public class InsertionSort {
	
	public static int[] insertionSort(int array[]) {
		for(int i = 1; i<array.length ; i++) {
			int element = array[i]; // the element we intend to bring to sorted area
			int j = i-1; // j variable points to the index position of the last value in sorted area
			
			while(j>=0 && array[j] > element) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = element;
		}
		return array;
	}
}
