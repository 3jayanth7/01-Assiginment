package assignmentOneJava;

import java.util.Scanner;

public class OneAssignmentJava {
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("Type a number between 50 and 300: ");
			int givenInput = input.nextInt();

			while (givenInput < 50 || givenInput > 300) {

				System.out.println("Oops, that number wasn't between 50 and 300. Try again.");
				givenInput = input.nextInt();
			}

			System.out.println("The number you typed in was: " + givenInput);

		
	}

}
