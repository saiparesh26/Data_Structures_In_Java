package com.saiparesh.linearsearch;

public class LinearSearch {
	
	public static int linearSearch(int array[], int data) {
		
		for(int i = 0; i< array.length ; i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return -1;
	}
}
