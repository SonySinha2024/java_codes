package patern;

import java.util.Scanner;





	import java.util.Scanner;

	public class FloydTriangle {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows for Floyd's Triangle: ");
	        int numRows = scanner.nextInt();

	        printFloydTriangle(numRows);

	        scanner.close();
	    }

	    public static void printFloydTriangle(int numRows) {
	        int number = 1;
	        for (int i = 1; i <= numRows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }
	            System.out.println();
	        }
	    }
	}
