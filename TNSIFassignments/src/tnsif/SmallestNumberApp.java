package tnsif;

import java.util.Scanner;

class SmallestNumberFinder {
    public void findSmallest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b); // Using ternary operator

        System.out.println(a == b && b == c ? "All numbers are equal" : "The smallest number is: " + smallest);

        scanner.close();
    }
}

public class SmallestNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestNumberFinder finder = new SmallestNumberFinder();
        finder.findSmallest();

	}

}
