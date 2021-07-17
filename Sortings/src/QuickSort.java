
public class QuickSort {

	public static void main(String args[]) {

		int arr[] = {8,2,9,4,3,6};
		quickSort(arr,0,arr.length-1);
	}

	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int median = partition(arr, low, high);
			quickSort(arr, low, median);
			quickSort(arr, median + 1, high);
		}
	}

	public static int partition(int arr[], int low, int high) {

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {

			do {
				i++;
			} while (arr[i] <= pivot);

			do {
				j--;
			} while (arr[j] > pivot);

			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, low, j);

		return j;
	}

	public static void swap(int arr[], int from, int to) {
		int tmp = arr[from];
		arr[from] = arr[to];
		arr[to] = tmp;
	}
	
	public static void print(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[0]+" ");
		}
	}
}
