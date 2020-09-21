package com.saiparesh.selectionsort;

public class App {

	public static void main(String[] args) {
		int[] array = {2,5,1,4,8,6,10,34,21};
		
		array = SelectionSort.selectionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
