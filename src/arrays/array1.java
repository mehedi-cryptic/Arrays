package arrays;

public class array1 {
	public static void main(String args[]) {
		int [] number= new int[5];
		number[0]=3;
		number[1]=4;
		number[2]=5;
		number[3]=6;
		number[4]=8;
		int len=number.length;
		System.out.println("Size of the array:"  +len);
		int sum=number[0]+number[1]+number[2]+number[3];
		System.out.println("Sum of arrays :"+sum);
	}

}
