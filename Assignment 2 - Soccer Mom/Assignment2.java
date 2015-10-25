package JavaAssignments;
import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		
			System.out.println("JAVA ASSIGNMENT 2: SOCCER MOM");
			System.out.println("COLIN SHUM");
			System.out.println();
		
		//Declare and initialize variables
			int jersey = 0;
			int combo = 0;
			int n = 1;
		//Create scanner to accept user inputs
			try {
			Scanner input = new Scanner(System.in);
				System.out.println("How many test cases would you like to try?");
				n = input.nextInt();
				
				for (int x=1; x<=n; x++){
					
						System.out.println("Enter the player's jersey number: ");
						jersey = input.nextInt();
						
						if (jersey >= 1 && jersey <= 99) {
							System.out.println("Selected jersey number: " + jersey);
							combo = ((jersey - 1) * (jersey - 2) * (jersey - 3)) / 6;
							System.out.println("Possible scoring combinations: " + combo + "\n");
						}
						else {
							System.out.println("Incorrect parameters. Please select a number between 1-99.");
							x--;
						}					
				}
			System.out.println("You have attempted " + n + " test case(s).");
			input.close();
			} catch (Exception e) {
				System.out.println("Error. Please retry your request with valid paramaters.");
		}
	}
}
