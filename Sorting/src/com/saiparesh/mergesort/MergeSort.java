package com.saiparesh.mergesort;

public class MergeSort {
	
	public static void sort(int inputArray[]) {
		sort(inputArray, 0 ,inputArray.length-1);
	}

	public static void sort(int[] inputArray, int start, int end) {
		if(end <= start) {
			return;
		}
		
		int mid = (start + end)/2;
		sort(inputArray, start, mid);
		sort(inputArray, mid+1, end);
		merge(inputArray, start, mid, end);
	}

	public static void merge(int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];
		
		//index counter for left side array
		int leftSlot = start;
		
		//index counter for right side array
		int rightSlot = mid+1;
		
		int k = 0;
		
		while(leftSlot <= mid && rightSlot <= end) {
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			}
			else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		/**
		 * When it gets to here , that means the above loop has completed
		 * So both the right and left side should be considered sorted
		 */
		
		if(leftSlot <= mid) {// consider the right side done being sorted. Left must be sorted already
			while(leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}			
		}
		else if (rightSlot <= end) {
			while(rightSlot <= end) {				
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		// Copy the temp array to input array
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];	
		}
	}
	
}
