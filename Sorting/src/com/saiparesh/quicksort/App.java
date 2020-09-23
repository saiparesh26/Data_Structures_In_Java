package com.saiparesh.quicksort;

public class App {

	public static void main(String[] args) {
		
		int[] array = {1,4,3,6,7,2,5,8,10,9};
		
		QuickSort.quickSort(array, 0, array.length -1);
		
		for(int i = 0; i< array.length ; i++) {
			System.out.println(array[i]);
		}
	}

}
