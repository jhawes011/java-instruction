
import java.util.Scanner;

import util.MyConsole;

public class TicTacToeApp {

	private static final String Player_X = null;

	static String boardBoarder = "+---+---+---+";
	
	static String[][] board = {{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}};
	
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Tic Tac Toe!", "+");
		Scanner sc = new Scanner(System.in);
		boolean winner = false;
		private static String currentPlayer = 'X';
		while (!winner) {
		    
		    playerMove(currentPlayer);
		    if (winner != true)  { 
			currentPlayer = (currentPlayer == X) ? 
		        
		    }
			displayBoard();
			// get user entry (position on board)
			MyConsole.print("Enter row (0-2): ");
			int row = sc.nextInt();
			MyConsole.print("Enter column (0-2): ");
			int col = sc.nextInt();
			// place x/o on board
			board[row][col] = currentPlayer;
			
			// simulation
			
//			board[1][1] = "X";
//			
//			board[0][2] = "O";
//			
//			board[0][0] = "X";
//			
//			board[1][2] = "O";
			displayBoard();
			// check for winner
		    }
			
		

		
		MyConsole.printL("\nBye");
	}
	
	private static void playerMove(char currentPlayer) {
	    // TODO Auto-generated method stub
	    
	}

	private static void displayBoard() {
		String boardString = boardBoarder + "\n";
		// loop through the rows
		for (int r = 0; r < board.length; r++) {
			// loop through the columns
			boardString += "|";
			for (int c = 0; c < board[r].length; c ++) {
				boardString += " " + (board[r][c]) + " |";
			}
			boardString += "\n" + boardBoarder + "\n";
		}
		MyConsole.printL(boardString);
	}
}