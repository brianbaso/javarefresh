import java.util.Scanner;

public class JavaLesson2 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a number: " );
		
		// if user enters an int
		if (userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered);
			
		} else {
			
			int randomNumber = (int) (Math.random() * 10); 
			System.out.println("A random number " + randomNumber);
		}
	}
	
}