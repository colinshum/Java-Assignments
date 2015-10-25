import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		String lights = "";
		String sequence = "";
		boolean runOnce = false;
		while (true) {
			lights = inputLights(lights, runOnce);
			sequence = findSequence(lights);
			if (sequence == null) {
				System.out.println("End of program.");
				System.exit(1);
			}
			else {
				lights = turnOff(sequence, lights);
			}
			runOnce = true;
		}
	}
	
	public static String inputLights (String lights, boolean runOnce) {
		boolean verify = false;
		int length = 0;
		Scanner input = new Scanner(System.in);
			while (verify == false) {
				if (runOnce == false) {
				System.out.println("Enter a set of light values. Accepted input: 0 or 1");
				lights = input.nextLine();
				}
				length = lights.length();
				verify = verifyLights(lights);
				if (verify == true && length >= 4 && length <= 25) {
					input.close();
				}
				else {
					System.out.println("Error. Try again! \n");
					lights = "";
					verify = false;
				}
			}
		return lights;
	}
	
	public static boolean verifyLights (String lights) {
	    return lights.matches("^[01]+");
	}
	
	public static String findSequence (String lights) {
		int charMax = lights.length();
		int pos1 = 0;
		int pos2 = 0;
		String pos = "";
		if (lights.contains("1111")) {
			pos1 = lights.indexOf("1111");
			pos2 = pos1 + 3;
			boolean zeroCheck = false;
			while (zeroCheck == false) {
				if (lights.substring(pos2, pos2+1).contains("0") && pos2 < charMax - 1) {
					break;
				}	
				else {
					if (pos2 < charMax - 1){
						pos2++;
					}
					else {
						pos2++;
						break;
					}
				}
			}
			pos = Integer.toString(pos1) + " " +  Integer.toString(pos2);
		}
		else {
			//System.out.println("Does not contain 4 or more consecutive 1's.");
			pos = null;
		}
		return pos;
	}

	public static String turnOff (String sequence, String lights) {
		String[] split = sequence.split(" ");	
		int pos1 = Integer.parseInt(split[0]);
		int pos2 = Integer.parseInt(split[1]);
		int diff = pos2 - pos1;
		String off = lights.substring(pos1,pos2);
		lights = lights.replaceFirst(lights.substring(pos1,pos2), "-");
		String printLights = lights;
		for (int x = 0; x < diff; x++) {
			printLights = lights;
			off = off.replaceFirst("1", "0");
			printLights = printLights.replace("-", off);
			System.out.println(printLights);
		}
		lights = lights.replace("-", off);
		
		return lights;
	}
}
