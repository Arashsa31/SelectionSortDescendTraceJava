package LabProgram811;

import java.util.Scanner;

public class DescendingOrder {
	// TODO: Write a void method selectionSortDescendTrace() that takes
	// an integer array and the number of elements in the array as arguments,
	// and sorts the array into descending order.
	public static void selectionSortDescendTrace(int[] numbers, int numElements) {
		for (int i = 0; i < numElements-1; i++) {
			// Find index of smallest remaining element
			int indexSmallest = i;
			// Find index of largest remaining element
			int indexlargest = i;
			for (int j = i; j < numElements; j++) {
				if (numbers[j] > numbers[indexlargest]) {
					indexlargest = j;
				}
			}

			// Swap numbers[indexlargest] and numbers[indexSmallest]
			int temp = numbers[indexlargest];
			numbers[indexlargest] = numbers[indexSmallest];
			numbers[indexSmallest] = temp;
			
			for (int j = 0; j < numElements; j++) {
				System.out.printf("%d ", numbers[j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int input, i = 0;
		int numElements = 0;
		int[] numbers = new int[10];

		// TODO: Read in a list of up to 10 positive integers; stop when
		// -1 is read. Then call selectionSortDescendTrace() method.

		input = scnr.nextInt();
		while (input != -1) {
			numbers[numElements++] = input;
			input = scnr.nextInt();
		}
		selectionSortDescendTrace(numbers, numElements);
	}
}
