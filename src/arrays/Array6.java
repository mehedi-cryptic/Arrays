package arrays;

import java.util.Scanner;

public class Array6 {
public static void main(String args[]) {
	Scanner value=new Scanner(System.in);
	int[][] A=new int[2][3];
	int[][] B=new int[2][3];
	int [][] C=new int[2][3];
	
	System.out.println("Enter values for A:");
	for(int row=0; row<2; row++) {
		for(int col=0; col<3; col++) {
			System.out.printf("A[%d][%d]=", row,col);
			A[row][col]=value.nextInt();
		}
	}
	System.out.println("A :");
	
	for(int row=0; row<2; row++) {
		for(int col=0; col<3; col++) {
			
		System.out.print(" " +A[row][col]);	
		}
		System.out.println();
		
	}
	System.out.println("Enter values for B:");
	for(int row=0; row<2; row++) {
		for(int col=0; col<3; col++) {
			System.out.printf("B[%d][%d]=", row,col);
			B[row][col]=value.nextInt();
		}
	}
	System.out.println("B :");
	
	for(int row=0; row<2; row++) {
		for(int col=0; col<3; col++) {
		System.out.print(" " +B[row][col]);	
		}
		System.out.println();
		
	}
	
	//add sum A and B
	System.out.println("\n");
	System.out.print("A+B: ");
	for(int row=0; row<2; row++) {
		for( int col=0; col<3; col++) {
			C[row][col]=A[row][col]+B[row][col];
			System.out.print("\t" +C[row][col]);
		}
		System.out.println();
	}
}
}
