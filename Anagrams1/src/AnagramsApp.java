
import java.util.Arrays;
import java.util.Scanner;

import util.MyConsole;

public class AnagramsApp
{

	public static void main(String[] args)
		{

			Scanner scan = new Scanner(System.in);
			String a = MyConsole.promptString("Enter first string: ");

			String b = MyConsole.promptString("Enter second string: ");
			scan.close();
			boolean ret = isAnagram(a, b);
			System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		}

	static boolean isAnagram(String a, String b)
		{

			a = a.toLowerCase();
			b = b.toLowerCase();

			if (a.length() != b.length())
			{
				return false;
			}

			char[] arrayA = a.toCharArray();
			char[] arrayB = b.toCharArray();

			Arrays.sort(arrayA);
			Arrays.sort(arrayB);

			return Arrays.equals(arrayA, arrayB);

		}
}