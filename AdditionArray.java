package day6;

import java.util.Scanner;

public class AdditionArray {
	
	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
			System.out.print("Enter the number of elements in the arrays: ");
			int size = xy.nextInt();
			
			    int[] array1 = new int[size];
		        int[] array2 = new int[size];
		        int[] sumArray = new int[size];
		        
		        System.out.println("Enter the elements of the first array:");
		        for (int i = 0; i < size; i++) {
		            array1[i] = xy.nextInt();
		        }
		        System.out.println("Enter the elements of the second array:");
		        for (int i = 0; i < size; i++) {
		            array2[i] = xy.nextInt();
		        }
		        for (int i = 0; i < size; i++) {
		            sumArray[i] = array1[i] + array2[i];
		        }
		        System.out.println("The resulting array after addition is:");
		        for (int value : sumArray) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
	}

}
