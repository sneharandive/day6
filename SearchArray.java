package day6;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        int position = -1; 
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                position = i; 
                break;       
            }
        }

        if (position != -1) {
            System.out.println("Element " + searchElement + " is found at position " + (position + 1)); // 1-based index
        } else {
            System.out.println("Element " + searchElement + " is not found in the array.");
        }
	}

}
