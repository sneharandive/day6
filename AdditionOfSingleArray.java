package day6;

import java.util.Scanner;

public class AdditionOfSingleArray {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the arrays:");
		int size = sc.nextInt();
		
		int[] arry1 = new int[size];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arry1[i] = sc.nextInt(); 
        }
        int sum = 0;
        for (int num : arry1) {
            sum += num;
        }
        System.out.println("The sum of the array elements is: " + sum);
	}
}
