package com.saiparesh.quicksort;

public class QuickSort {
	
	public static void quickSort(int[] array, int p, int r) {
		if(p < r) {
			int pp = partition(array,p,r);
			quickSort(array, p, pp-1);
			quickSort(array, pp + 1, r);
		}
		else {
			
		}
	}

	private static int partition(int[] array, int p, int r) {
		
		int pivot = array[r];
		//in the first iteration i goes from -1
		int i = p-1;
		for(int j = p; j<=r; j++) {
			if(array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		// put the pivot value in the correct slot next
		int temp = array[i+1];
		array[i+1] = array[r];
		array[r] = temp;
		return i;
	}
}
