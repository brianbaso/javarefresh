import java.util.*;
import java.io.*;

public class JavaLesson6 {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		//divideByZero(2);
		System.out.println("How old are you?");
		int age = getValidAge();
		
		if (age != 0) {
			System.out.println("You are " + age + " years old.");
		}
		
		getAFile("./someText.txt");
		
	}
	
	public static void divideByZero(int a) {
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println("You cannot do that.");
			System.out.println(e.getMessage());
		}
	}
	
	public static int getValidAge() {
		try {
			return userInput.nextInt();
		} catch (InputMismatchException e) {
			userInput.next();
			System.out.println("Invalid age.");
			return 0;
		}
	}
	
	public static void getAFile(String fileName) {
		try {
		FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file.");
		}
	}
}