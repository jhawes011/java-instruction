import java.util.ArrayList;
import java.util.List;

import util.MyConsole;

public class ArrayListApp {

    public static void main(String[] args) {
	MyConsole.printHeader("Welcome to the ArrayList App");
	
	List<String> names = new ArrayList<>();
	names.add("Alice");
	names.add("Bob");
	names.add("Charlie");
	names.add("David");
	names.add("Edward");
	names.add("Frank");
	names.add("Grace");
	names.add("Helen");
	
	names.add("Test");
	
	names.forEach(name -> MyConsole.printL(name));
	MyConsole.printL("");
	
	MyConsole.printL(names.get(4));
	MyConsole.printL("");
	names.add(4, "Eve");
	names.forEach(name -> MyConsole.printL(name));
	MyConsole.printL("");
	names.remove("Test");
	names.remove(4);
	names.forEach(name -> MyConsole.printL(name));
	
	MyConsole.printL("\nGoodbye!");

    }

}
