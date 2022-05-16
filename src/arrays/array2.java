package arrays;

import java.util.Scanner;

public class array2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		double[] number = new double[5];
		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextDouble();
		}

		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println("Sum is:" + sum);
		double avg = sum / number.length;
		System.out.println("Average is :" + avg);
	}
}
