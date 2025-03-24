
import java.util.Arrays;
import java.util.Scanner;

public class anagramsApp1 {

   

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    static boolean isAnagram(String a, String b) {
    	//convert to lowercase
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    			
    	// if length of a != b then false
    	if (a.length() != b.length())
    	{
    		return false;
    	}
    	
    	//convert to an array
    	char[] arrayA = a.toCharArray();
    	char[] arrayB = b.toCharArray();
		
    	// Sort the character arrays
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        // Compare sorted character arrays
        return Arrays.equals(arrayA, arrayB);
    	
    }
}