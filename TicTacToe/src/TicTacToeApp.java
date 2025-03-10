
import java.util.Scanner;

import util.MyConsole;

public class TicTacToeApp {

    public static void main(String[] args) {
	MyConsole.printHeader("Welcome to Tic Tac Toe!", "=");
	Scanner sc = new Scanner(System.in);
	boolean winner = false;
	int turns = 0;
	char currentPlayer = 'X';
	String choice = "y";
	while (choice.toLowerCase().equals("y")) {
	    while (winner != true) {
		turns = turns + 1;

		MyConsole.print("---------Player " + currentPlayer + " turn----------\n");
		displayBoard();

		MyConsole.print("Enter row (0-2): ");
		int row = sc.nextInt();
		MyConsole.print("Enter column (0-2): ");
		int col = sc.nextInt();

		if (board[row][col] != " ") {
		    MyConsole.printL("\n-------This spot is already taken. Try again!---------\n");
		    turns = turns - 1;
		    continue;
		} else {
		    board[row][col] = String.valueOf(currentPlayer);
		    MyConsole.printL("");

		    winner = checkForWinner();
		    if (winner == false && turns < 9) {
			currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			continue;
		    }
		}
	    }
	    if (winner == true) {
		MyConsole.printL("---------Player " + currentPlayer + " wins!----------\n");
		displayBoard();

	    } else {
		MyConsole.printL("------------It's a tie!------------\n");
		displayBoard();
	    }
	    turns = 0;
	    winner = false;
	    board = new String[][] { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

	    sc.nextLine();
	    choice = MyConsole.promptString("Do you want to play again? (y/n): ");
	    
	    MyConsole.printL("");
	}
	sc.close();
	MyConsole.printL("\n-------------Bye---------------");

    }

    public static boolean checkForWinner() {
	boolean winner = false;
	// check rows
	for (int r = 0; r < board.length; r++) {
	    if (board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2]) && !board[r][0].equals(" ")) {
		return winner = true;
	    }
	}
	// check columns
	for (int c = 0; c < board[0].length; c++) {
	    if (board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c]) && !board[0][c].equals(" ")) {
		return winner = true;
	    }
	}
	// check diagonals
	if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(" ")) {
	    return winner = true;
	}
	if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals(" ")) {
	    return winner = true;
	}
	return winner;

    }

    private static void displayBoard() {
	String boardString = boardBoarder + "\n";
	// loop through the rows
	for (int r = 0; r < board.length; r++) {
	    // loop through the columns
	    boardString += "|";
	    for (int c = 0; c < board[r].length; c++) {
		boardString += " " + (board[r][c]) + " |";
	    }
	    boardString += "\n" + boardBoarder + "\n";
	}
	MyConsole.printL(boardString);
    }

    static String boardBoarder = "+---+---+---+";

    static String[][] board = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
}