import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String ifContinue = "y";
		String userInput;
		do {
			System.out.print("Enter some text: ");
			userInput = scnr.nextLine();
			System.out.println(userInput);
			
			// prompt user to enter if they want to continue
			System.out.print("Would you like to continue (y/n)? ");

			ifContinue = scnr.nextLine();
		} while (ifContinue.equalsIgnoreCase("y"));// determine the input

		scnr.close();
		// when user enter n, display "Goodbye!"
		System.out.println("Goodbye!");
		scnr.close();	

	}

}
