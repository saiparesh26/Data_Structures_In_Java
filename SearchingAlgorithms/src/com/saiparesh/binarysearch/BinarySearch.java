package com.saiparesh.binarysearch;

public class BinarySearch {
	
	public static int binarySearch(int array[], int item) {
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end ) {
			int mid = (start + end) / 2;
			if(array[mid] == item) {
				return mid;
			}
			else if (item < array[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
