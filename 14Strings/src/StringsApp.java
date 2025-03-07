import util.MyConsole;

public class StringsApp {

    public static void main(String[] args) {
	MyConsole.printHeader("Welcome to the Strings App");
	// p. 469 index, length, substring

	String fullName = "Joseph Allen Hawes";
	// first, middle, last name?

	int firstSpaceIdx = fullName.indexOf(" ");
	MyConsole.printL("first space = " + firstSpaceIdx);
	int secondSpaceIdx = fullName.indexOf(" ", firstSpaceIdx + 1);
	MyConsole.printL("second space = " + secondSpaceIdx);
	// p.471 substrings
	String firstName = fullName.substring(0, firstSpaceIdx);
	MyConsole.printL(firstName);

	String middleName = fullName.substring(firstSpaceIdx + 1, secondSpaceIdx);
	MyConsole.printL(middleName);

	String lastName = fullName.substring(secondSpaceIdx + 1);
	MyConsole.printL(lastName);

	// hangman hint - hiddenword
	String theWord = "happyhour";
	String hiddenWord = "_".repeat(theWord.length());
	MyConsole.printL("The word = " + theWord + ".");
	MyConsole.printL("Hidden word = " + hiddenWord + ".");

	// display the hidden word with spaces

	MyConsole.printHeader("Resolve letters!");
	// loop until all letters guessed
	while (hiddenWord.indexOf('_') >= 0) 
	{
	    displayHiddenWord(hiddenWord);
	    // guess a letter
	    String guess = MyConsole.promptString("Enter a letter guess: ");
	    // resolve letter in hiddenword or display incorrect guess
	    
	    char[] chars = theWord.toCharArray();
	    char[] hiddenChars = hiddenWord.toCharArray();
	    
	    if (theWord.indexOf(guess.indexOf(0)) == -1)
	    {
		MyConsole.printL(guess + " is not in the word.");
	    } 
	    else 
	    {
		// replace _ with letter
		for (int i = 0; i < chars.length; i++)
		{
		    if (guess.charAt(0) == chars[i]) 
		    {
			hiddenChars[i] = guess.charAt(0);
		    }
		}
	    }
	    for (int i = 0; i < chars.length; i++) {
		if (guess.charAt(0) == chars[i]) {
		   
		    hiddenChars[i] = guess.charAt(0);
		}
	    }
	    hiddenWord = new String(hiddenChars);
	}

	MyConsole.printL("\nGoodbye");
    }

    private static void displayHiddenWord(String hiddenWord) {
	String hiddenWordDisplay = "";
	char[] chars = hiddenWord.toCharArray();
	for (int i = 0; i < chars.length; i++) {
	    hiddenWordDisplay += chars[i] + " ";
	}
	MyConsole.printL("hidden word display = "+hiddenWordDisplay);
    }

}
