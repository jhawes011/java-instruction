import java.util.Scanner;

public class MethodsAPP {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.println("Welcome to methods");

	int x = promptInt("Enter number x: ");
	int y = promptInt("Enter number y: ");

	int sum = x + y;
	System.out.println("Sum of x and y is: " + sum);

	double a = promptDouble("Enter a double a: ");
	double b = promptDouble("Enter a double b: ");
	double div = a / b;
	System.out.println("Division of a and b is: " + div);

	sc.close();
    }

    private static double promptDouble(String prompt) {
	boolean isValid = false;
	double result = 0.0;
	while (!isValid) {

	    System.out.print(prompt);
	    if (sc.hasNextDouble()) {
		result = Double.parseDouble(sc.nextLine());
		isValid = true;
	    } else {
		System.err.println("Invalid input. Please enter a number.");
		sc.nextLine(); // discard the input
	    }

	}
	return result;
    }

    private static int promptInt(String prompt) {
	boolean isValid = false;
	int result = 0;
	while (!isValid) {

	    try {
		System.out.print(prompt);
		result = Integer.parseInt(sc.nextLine());
		isValid = true;

	    } catch (Exception e) {
		System.err.println("Invalid input. Please enter a number.");
	    }

	}
	return result;

    }
}
