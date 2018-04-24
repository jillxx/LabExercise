import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		int num1;
		double num2, num3, num4, num5, num6;
		String ifContinue;

		Scanner scnr = new Scanner(System.in);

		do {
			// prompt user to enter number and +1 as result
			System.out.print("Enter a number: ");
			num1 = scnr.nextInt();
			System.out.println(num1 + 1);

			// prompt user to enter number and + 0.5 as result
			System.out.print("Enter a number: ");
			num2 = scnr.nextDouble();
			System.out.println(num2 + 0.5);

			// prompt user to enter 2 numbers and show the sum
			System.out.print("Enter a number: ");
			num3 = scnr.nextDouble();
			System.out.print("Enter another number: ");
			num4 = scnr.nextDouble();
			System.out.println("The sum is " + (num3 + num4));

			// prompt user to enter 2 numbers and show the multiply sum
			System.out.print("Enter a number: ");
			num5 = scnr.nextDouble();
			System.out.print("Enter another number: ");
			num6 = scnr.nextDouble();
			System.out.println("The product is " + num5 * num6);

			// prompt user to enter if they want to continue
			System.out.print("Would you like to continue (y/n)? ");

			ifContinue = scnr.next();
		} while (ifContinue.equalsIgnoreCase("y"));// determine the input
		scnr.close();

	}

}
