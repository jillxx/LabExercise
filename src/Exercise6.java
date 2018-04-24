import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		String ifContinue = "y";

		Scanner scnr = new Scanner(System.in);

		do {
			System.out.println("Hello, World!");
			//prompt user to enter if they want to continue
			System.out.print("Would you like to continue (y/n)? ");
			
			ifContinue = scnr.nextLine();
		} while (ifContinue.equalsIgnoreCase("y"));//determine the input

		scnr.close();
        //when user enter n, display "Goodbye!"
		System.out.println("Goodbye!");
	}
}
