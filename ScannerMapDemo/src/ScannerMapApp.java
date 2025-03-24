import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMapApp
{

	public static void main(String[] args)
		{
			System.out.println("======Scanner app demo======");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter some data: ");
			//String inputStr = sc.nextLine();
			//System.out.println("You entered: " + inputStr);
			String val1 = sc.next();
			String val2 = sc.next();
			String val3 = sc.next();
			String val4 = sc.next();
			String val5 = sc.next();
			
			System.out.println("Values: " + val1 + ", " + val2 + ", " + val3 + ", " + val4 + ", " + val5);
				sc.close();
			
			Map<String, String> statesMap = new HashMap<String, String>();
			String statesString = " OH Ohio KY Kentucky TN Tennessee FL Florida";
			Scanner sc2 = new Scanner(statesString);
			while (sc2.hasNext())
			{
				String stateAbbr = sc2.next();
				String stateName = sc2.next();
				statesMap.put(stateAbbr, stateName);
			}
			System.out.println("States Map Entries: " + statesMap);
			for (Map.Entry<String, String> entry : statesMap.entrySet())
			{
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			sc2.close();
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter a state abbreviation: ");
		String stateAbbrev = sc3.nextLine();
		System.out.println("State name: " + statesMap.get(stateAbbrev));
		
		sc3.close();
			System.out.println("======End of Scanner app demo======");
		}

}
