package searchalgorithms;

public class BinarySearch {

	BinarySearch() {

	}

	public int binarySearch(int array[], int itemToSearch) {
		int size = array.length;
		int left, med, right;
		left = 0;
		med = 0;
		right = size - 1;
		while (left <= right) {
			med =  left + (right - left) / 2;

			if (array[med] == itemToSearch)
				return med+1;

			if (itemToSearch < array[med]) {
				left = 0;
				right = med-1;
			}

			if (itemToSearch > array[med]) {
				left = med+1;
			}
		}
		return -1;
	}

}
