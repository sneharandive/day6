package day6;

import java.util.Scanner;

public class SquareCubeArray {

	public static void main(String[] args) {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
        int size = ab.nextInt();

        int[] array = new int[size];
        int[] squares = new int[size];
        int[] cubes = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = ab.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            squares[i] = array[i] * array[i];
            cubes[i] = array[i] * array[i] * array[i];
        }
        
        System.out.println("Original Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Squares Array: ");
        for (int value : squares) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Cubes Array: ");
        for (int value : cubes) {
            System.out.print(value + " ");
        }
        System.out.println();

	}

}
