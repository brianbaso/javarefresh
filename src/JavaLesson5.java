import java.util.Scanner;

public class JavaLesson5 {
	
	static int randomNumber; // class variable
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println(getRandomNum());
	}
	
	public static int getRandomNum() {
		randomNumber = (int) (Math.random() * 51);
		
		return randomNumber;
	}
	
	
}