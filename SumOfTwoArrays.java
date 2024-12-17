package day6;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] resultArray = new int[size];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            resultArray[i] = array1[i] + array2[i];
        }

        System.out.println("The resultant array after addition is:");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }

	}

}
