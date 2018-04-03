import java.util.Scanner;

public class JavaLesson4 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		String contYorN = "Y";
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y")) {
			System.out.println(h);
			System.out.print("Continue? Y or N");
			contYorN = userInput.nextLine();
			h++;
			
		}
	}
}