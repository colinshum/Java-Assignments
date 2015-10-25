import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		System.out.println("Colin Shum - Assignment 1: Phone Number Conversion\n");
		
		Scanner input = new Scanner(System.in);
		String pNumber = "";
		boolean complete = false;
		
		while (complete == false) {
			try {
				System.out.println("Enter a phone number: ");
				pNumber = input.nextLine();
				
				//Convert string to upper case
				pNumber = pNumber.toUpperCase();
				
				//Use REGEX to replace all non-alphanumeric characters with spaces
				pNumber = pNumber.replaceAll("[^0-9A-Z]","");
				
				//Length check
				if (pNumber.length() < 10) {
					System.out.println("Enter a valid input. Minimum 10 alphanumeric characters.");
					System.out.println("Your input: " + pNumber + "\n");
				}
				
				//Exit loop, trim string to 10 characters
				else {
					complete = true;
					pNumber = pNumber.substring(0,10);
				}
			}
			catch (Exception ex) {
				System.out.println("Error.");
			}
		}
		
		//Replace specified character groups with numbers using REGEX
		pNumber = pNumber.replaceAll("[A-C]", "2");
		pNumber = pNumber.replaceAll("[D-F]", "3");
		pNumber = pNumber.replaceAll("[G-I]", "4");
		pNumber = pNumber.replaceAll("[J-L]", "5");
		pNumber = pNumber.replaceAll("[M-O]", "6");
		pNumber = pNumber.replaceAll("[P-S]", "7");
		pNumber = pNumber.replaceAll("[T-V]", "8");
		pNumber = pNumber.replaceAll("[W-Z]", "9");
		
		//Format string
		pNumber = String.format("%s-%s-%s", 
				  pNumber.substring(0,3),
				  pNumber.substring(3,6),
				  pNumber.substring(6,10));
		
		//Print output
		System.out.println("\n" + "Your number is: " + pNumber);
		
		//Close scanner
		input.close();
	}	
}
