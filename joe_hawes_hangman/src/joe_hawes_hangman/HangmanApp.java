package joe_hawes_hangman;

public class HangmanApp {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	
	
	
	
    }
    
    public static String getHangmanImage(int incorrectGuesses) {
        return switch (incorrectGuesses) {
            case 6 -> """
                _____ 
                |   | D
                |   O  E
                |  /|\  A
                |  / \   D
                |______   
                """;
            case 5 -> """
                _____ 
                |   | 
                |   O 
                |  /|\ 
                |  / 
                |______
                """;
            case 4 -> """
                _____ 
                |   | 
                |   O 
                |  /|\ 
                |  
                |______
                """;
            case 3 -> """
                _____ 
                |   | 
                |   O 
                |  /| 
                |  
                |______
                """;
            case 2 -> """
                _____ 
                |   | 
                |   O 
                |   | 
                |  
                |______
                """;
            case 1 -> """
                _____ 
                |   | 
                |   O 
                |  
                |  
                |______
                """;
            case 0 -> """
                _____ 
                |   | 
                |  
                |  
                |  
                |______
                """;
            default -> "";
        };
    }
}
