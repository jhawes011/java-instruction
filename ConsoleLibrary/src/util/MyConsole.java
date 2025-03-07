package util;
import java.util.Scanner;
public class MyConsole {

    
	

	
	    private static Scanner sc = new Scanner(System.in);

	    public static int promptInt(String prompt) 
	    {
	        int result = 0;
	        boolean isValid = false;
	        while (!isValid)
	        {
	            print(prompt);
	            if (sc.hasNextInt())
	            {
	                result = sc.nextInt();
	                isValid = true;
	            } 
	            else 
	            {
	                printL("Error - invalid int.");
	                sc.next(); // Clear invalid input
	            }
	        }
	        return result;
	    }

	    public static String promptReqString(String prompt, String str1, String str2) 
	    {
	        String result = "";
	        boolean isValid = false;
	        while (!isValid) 
	        {
	            result = promptString(prompt);
	            if (!result.trim().isEmpty())
	            {
	                if (result.equals(str1) || result.equals(str2)) 
	                {
	                    isValid = true;
	                } 
	                else
	                {
	                    printL("Error - string must be either " + str1 + " or " + str2);
	                }
	            } 
	            else 
	            {
	                printL("Error - entry is required.");
	            }
	        }
	        return result;
	    }

	    public static double promptDouble(String prompt) 
	    {
	        double result = 0;
	        boolean isValid = false;
	        while (!isValid) 
	        {
	            print(prompt);
	            if (sc.hasNextDouble()) 
	            {
	                result = sc.nextDouble();
	                isValid = true;
	            } 
	            else 
	            {
	                printL("Error - invalid double.");
	                sc.next(); // Clear invalid input
	            }
	        }
	        return result;
	    }

	    public static double promptDecimal(String prompt)
	    {
	        return promptDouble(prompt); // Java does not have a decimal type like C#, using double
	    }

	    public static int promptInt(String message, int min, int max)
	    {
	        int result = 0;
	        boolean isValid = false;
	        while (!isValid)
	        {
	            result = promptInt(message);
	            if (result >= min && result <= max)
	            {
	                isValid = true;
	            } 
	            else
	            {
	                printL("Error - int must be within range " + min + "-" + max);
	            }
	        }
	        return result;
	    }

	    public static String promptString(String prompt) {
	        print(prompt);
	        return sc.next();
	    }

	    public static void print(String msg) {
	        System.out.print(msg);
	    }

	    public static void printL(String msg) {
	        System.out.println(msg);
	    }

	    public static void readL() {
	        sc.nextLine(); // Consume the newline character
	    }
    	

}
    


