package com.saiparesh.recursivesearch;

public class App {

	public static void main(String[] args) {
		
		int[] array = {2,4,5,7,8,9,10,12,13,14,15};
		
		System.out.println(RecursiveSearch.recursiveLinearSearch(array, 0, 8));
		System.out.println(RecursiveSearch.recursiveBinarySearch(array, 0, array.length - 1, 12));
	}

}
