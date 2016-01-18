package codingedge.connect4.logic;

public class Board {

	// The default width of a Connect4 board
	private static int DEFAULT_BOARD_WIDTH = 7;

	// The default height of a Connect4 board
	private static int DEFAULT_BOARD_HEIGHT = 6;
	
	// Private fields that store the width, and height of the board
	private int width, height;
	
	// Board of ints representing the state of the board
	// 0 signifies no piece is in that cell
	// 1 signifies player one has a piece in that cell
	// 2 signifies player two has a piece in that cell
	// NOTE: we are assuming the players are either 1 or 2
	private int[][] board;

	
	// STUDENT-TODO
	// Initialize a default board of size 7x6 with all zeros (empty spaces)
	public Board() {
		this.width = DEFAULT_BOARD_WIDTH;
		this.height = DEFAULT_BOARD_HEIGHT;

		board = new int[this.width][this.height];
	}
	
	// TODO: maybe remove?
	// Initialize a board of size width x height with all zeros
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		board = new int[this.width][this.height];
	}

	// STUDENT-TODO
	// Clear the board to all zeroes
	public void clearBoard() {
		board = new int[this.width][this.height];
	}

	// STUDENT-TODO
	// Attempt to add a piece in the column,
	// Returns the row in which it was placed in
	// Else -1, if the column is full
	public int addToColumn(int column, int player) throws InvalidColumnException {
		if (column < 0 || column >= width) {
			throw new InvalidColumnException("Column number " + column + " was invalid");
		} else if (!isColumnFull(column)) {
			for (int h = 0; h < this.height; h++) {
				if (board[column][h] == 0) {
					board[column][h] = player;
					return h;
				}
			}
		}
		return -1;
	}

	// STUDENT-TODO
	// Check if the game is won from position (x,y)
	// If won, return the number of the player that won (1 or 2)
	// Else return 0
	public int isGameWonFromPosition(int x, int y) { 
		if (checkForSolutionFromPosition(x, y)) { 
			return board[x][y];
		} else { 
			return 0;
		}
	}
	
	// TODO: can maybe refactor the two methods into each other
	
	// STUDENT-TODO
	// Check if there is a solution (4 consecutive pieces of the same colour,
	// in a row, column, or diagonal) that involves the piece at position (x,y)
	// Return true if a solution exists at that position
	// Else return false
	private boolean checkForSolutionFromPosition(int x, int y) { 
		String s = "";
		int player = board[x][y];
		for (int col = 0; col < this.width; col++){
			s = s.concat(Integer.toString(board[col][y]));
		}
		if (checkForSolutionFromString(s, player)) {
			return true;
		}

		s = "";
		for (int row = 0 ; row < this.height; row++){
			s = s.concat(Integer.toString(board[x][row]));
		}
		if (checkForSolutionFromString(s, player)) {
			return true;
		}
		s = Integer.toString(board[x][y]);
		for (int row = y + 1, col = x + 1; row < this.height && col < this.width; row++, col++){
			s = s.concat(Integer.toString(board[col][row]));
		}

		for (int row = y - 1, col = x - 1; row >= 0 && col >= 0; row--, col--){
			s = Integer.toString(board[col][row]).concat(s);
		}
		if (checkForSolutionFromString(s, player)) {
			return true;
		}
		
		s = Integer.toString(board[x][y]);
		for (int row = y - 1, col = x + 1; row >= 0 && col < this.width; row--, col++){
			s = s.concat(Integer.toString(board[col][row]));
		}

		for (int row = y + 1, col = x - 1; row < this.height && col >= 0; row++, col--){
			s = s.concat(Integer.toString(board[col][row]));
		}
		if (checkForSolutionFromString(s, player)) {
			return true;
		}
		/**
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				if (dx != 0 || dy != 0) {
					if (checkForSolutionInDirection(x, y, dx, dy, player, 4)) {
						return true;
					}
				}
			}
		} **/
		
		return false;		
	}
	
	// STUDENT-TODO
	// Check if the entire board is full (ie all columns are full)
	public boolean isBoardFull() {
		for (int i = 0; i < this.width; i++) {
			if (isColumnFull(i)) {
				return true;
			}
		}
		return false;
	}

	
	// STUDENT-TODO
	// Check if the col-th column of the board is full
	// NOTE: remember to start counting from 0 
	private boolean isColumnFull(int col) {
		for (int h = this.height; h > 0; h--) {
			if (board[col][h - 1] == 0) { 
				return false;
			}
		}
		return true;
	}

	// Private method that can be used to check if there
	// are 4 consecutive 'player' ints, in a string
	// Ex.
	//    checkForSolutionFromString("12221111", 1)  will return true
	//    checkForSolutionFromString("12221111", 2)  will return false
	private boolean checkForSolutionFromString(String s, int player){
		String winner = new String(new char[4]).replace("\0", Integer.toString(player));
		if (s.contains(winner)) {
			return true;
		}
		return false;
	}

	
	// Simple getters for private fields
	public int[][] getBoardArray() {
		return board.clone();
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth(){
		return width;
	}

	
	// Methods for drawing the board on console
	public void drawBoard(int playerOne, int playerTwo) {
		int[][] boardArr = this.getBoardArray();
		drawIntBoard(boardArr, this.getWidth(), this.getHeight(), playerOne, playerTwo);
	}

	private void drawIntBoard(int[][] boardArr, int width, int height, int playerOne, int playerTwo) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		String header = "";
		for (int x = 0; x < width; x++) {
			header = header.concat("  " + x + "  ");
		}
		System.out.println(header);
		for (int y = height - 1; y >= 0; y--) {
			String output = "";
			for (int x = 0; x < width; x++) {
				output = output.concat("| ");
				int boardValue = boardArr[x][y];
				if (boardValue == playerOne){
					output = output.concat("o");
				} else if (boardValue == playerTwo){
					output = output.concat("x");
				} else{
					output = output.concat(" ");
				}
				output = output.concat(" |");
			}

			System.out.println(output);
		}
	}

}
