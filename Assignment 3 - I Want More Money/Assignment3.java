package JavaAssignments;
import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
			System.out.println("ASSIGNMENT 3 - COLIN SHUM");
			System.out.println();
			
			int slotOne = 0;
			int slotTwo = 0;
			int slotThree = 0;
			int quarters = 0;
			int playCount = 0;

		Scanner input = new Scanner(System.in);
			while (quarters == 0){
				try {	
					System.out.println("Enter number of quarters in the jar: ");
					quarters = input.nextInt();
					if (quarters > 0 && quarters < 1000) {
					}
					else {
						System.out.println("Enter a valid number between 1-999. \n");
						quarters = 0;
					}
				}
				catch (Exception e) {
					System.out.println("Invalid input.\n");
					System.out.println("");
					quarters = 0;
					input.nextLine();
				}
			}
			
			while (slotOne == 0) {
				try {
					System.out.println("How many times has the first machine been played since paying out?");
					slotOne = input.nextInt();
					if (slotOne > 0 && slotOne < 35) {
					}
					else {
						System.out.println("Enter a valid number between 1-34.\n");
						slotOne = 0;
					}
				}
				catch (Exception e) {
					System.out.println("Invalid input.\n");
					slotOne = 0;
					input.nextLine();
				}
			}
			
			while (slotTwo == 0) {
				try {
					System.out.println("How many times has the second machine been played since paying out?");
					slotTwo = input.nextInt();
					if (slotTwo > 0 && slotTwo < 100) {
					}
					else {
						System.out.println("Enter a valid number between 1-99.\n");
						slotTwo = 0;
					}
				}
				catch (Exception e) {
					System.out.println("Invalid input.\n");
					slotTwo = 0;
					input.nextLine();
				}
			}

			while (slotThree == 0) {
				try {
					System.out.println("How many times has the third machine been played since paying out?");
					slotThree = input.nextInt();
					if (slotThree > 0 && slotThree < 10) {
					}
					else {
						System.out.println("Enter a valid number between 1-9. \n");
						slotThree = 0;
					}
				}
				catch (Exception e) {
					System.out.println("Invalid input. \n");
					slotThree = 0;
					input.nextLine();
				}
			}
		
		input.close();
		
		while (quarters > 0) {
			
			if (quarters > 0) {
				playCount ++; quarters --; slotOne ++;
					if (slotOne == 35) {
						slotOne = 0; 
						quarters += 30;
					}
			} 
			
			if (quarters > 0) {
				playCount ++; quarters --; slotTwo ++;
					if (slotTwo == 100) {
						slotTwo = 0;
						quarters += 60; 
					}
			} 
			
			if (quarters > 0) {
				playCount ++; quarters --; slotThree ++;
					if (slotThree == 10) {
						slotThree = 0;
						quarters += 9;
					}
			}
			
		}
		
		System.out.println("You can play " + playCount + " time(s) before going broke.");
	}
}