package org.coding.thoughts.solvedproblems.sortings;

public class SortingUtil {

	public static void bubbleSort(int[] array) {
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
	}

	public static void insertionSort(int[] array) {
		if (array != null) {
			for (int i = 1; i < array.length; i++) {
				int temp = array[i];
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (array[j] > temp) {
						array[j + 1] = array[j];
					} else {
						break;
					}
				}
				array[j + 1] = temp;
			}
		}
	}

	public static void selectionSort(int[] array) {
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				int minValIdx = i;
				for (int j = i + 1; j < array.length; j++) {
					if (array[minValIdx] > array[j]) {
						minValIdx = j;
					}
				}
				if (i != minValIdx) {
					swap(array, minValIdx, i);
				}
			}
		}
	}

	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	public static void quicksort(int[] array, int start, int end) {
		if (start < end) {
			int i = partition(array, start, end);
			quicksort(array, start, i - 1);
			quicksort(array, i + 1, end);
		}
	}

	public static int partition(int[] array, int start, int end) {
		int partionIndex = start;
		int pivot = array[end];
		for (int i = start; i < end; i++) {
			if (array[i] <= pivot) {
				if (i != partionIndex) {
					swap(array, partionIndex, i);
				}
				partionIndex++;
			}
		}

		swap(array, end, partionIndex);
		return partionIndex;
	}

	private static void swap(int[] array, int start, int i) {
		int temp = array[i];
		array[i] = array[start];
		array[start] = temp;
	}

	public static void mergeSort(int[] array) {
		if (array.length < 2) {
			return;
		}

		int mid = array.length / 2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		for (int i = 0; i < right.length; i++, mid++) {
			right[i] = array[mid];
		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}

	public static void merge(int[] left, int[] right, int[] array) {
		if (left == null || right == null || array == null) {
			return;
		}

		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				array[k++] = right[j++];
			} else if (left[i] < right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = left[i++];
				array[k++] = right[j++];
			}
		}
		while (i < left.length) {
			array[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			array[k] = right[j];
			j++;
			k++;
		}
	}

}
