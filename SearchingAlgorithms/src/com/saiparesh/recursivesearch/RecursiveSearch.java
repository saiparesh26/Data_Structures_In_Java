package com.saiparesh.recursivesearch;


public class RecursiveSearch {
	
	public static int recursiveLinearSearch(int array[], int i, int item) {
		if(i > array.length) {
			return -1;
		}
		else if (array[i] == item) {
			return i;
		}
		else {
			return recursiveLinearSearch(array, i + 1, item);
		}
	}
	
	public static int recursiveBinarySearch(int array[], int start, int end, int item) {
		if (start > end) {
			return -1;
		}
		else {
			int mid = (start + end) / 2;
			if (array[mid] == item) {
				return mid;
			}
			else if (item < array[mid]) {
				return recursiveBinarySearch(array, start, mid - 1, item);
			}
			else {
				return recursiveBinarySearch(array, mid + 1, end, item);
			}
		}
	}
}
