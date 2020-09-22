package com.saiparesh.mergesort;

public class App {

	public static void main(String[] args) {
		
		int[] array = {2,5,6,1,7,8,9,3,10,6,3,4,13,11};
		
		MergeSort.sort(array);
	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
