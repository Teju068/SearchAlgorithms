package searchalgorithms;

import static searchalgorithms.Utils.println;
import java.util.Scanner;

public class SearchAlgorithms {
	public static void main(String[] args) {
		int size;
		int array[] = { 1, 10, 45, 12, 22, 32, 2, 3, 4, 5 };
		int sorted_array[] = { 1, 2, 3, 4, 5, 10, 12, 22, 32, 45 };
		size = array.length;
		Scanner scanner = new Scanner(System.in);
		println("********* Searching Algorithms *********");
		println("Press 1 for Linear Search");
		println("Press 2 for Binary Search");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			break;
		case 2:
			/**
			 * Binary search takes a sorted Array to find an item
			 */
			println("Enter the item you want to search");
			int itemToSearch = scanner.nextInt();
			BinarySearch binarySearch = new BinarySearch();
			int result = binarySearch.binarySearch(sorted_array, itemToSearch);
			if (result == -1)
				println("Item not found!");
			else
				println("Item found at " + result + " position");
			break;
		}

		scanner.close();
	}
}
