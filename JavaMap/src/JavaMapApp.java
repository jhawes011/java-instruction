import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapApp
{

	public static void main(String[] args)
		{
			Map<String, Integer> phoneBook = new HashMap<>();
			String inputStr = ("3\n"+"uncle sam\n"+"99912222\n"+"tom\n"+"11122222\n"+"harry\n"+"12299933\n"+"uncle sam\n"+"uncle tom\n"+"harry\n");
			Scanner in = new Scanner(inputStr);
			
			int n=in.nextInt();
			in.nextLine();
			for(int i=0;i<n;i++)
			{
				String name=in.nextLine();
				int phone=in.nextInt();
				in.nextLine();
				phoneBook.put(name, phone);
			}
			while(in.hasNext())
			{
				String s=in.nextLine();
			}

		}

}
