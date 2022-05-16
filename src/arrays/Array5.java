package arrays;

public class Array5 {
	public static void main(String args[]) {
		int[][] number = new int[2][3];
		number[0][0] = 30;
		number[0][1] = 40;
		number[0][2] = 50;
		number[1][0] = 60;
		number[1][1] = 70;
		number[1][2] = 80;

		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(" " + number[row][col]);
			}
			System.out.println();
		}

	}
}
