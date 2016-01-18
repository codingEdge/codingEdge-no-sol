package codingedge.connect4.logic;

import java.util.Scanner;

public class Game {
	
	// Strings representing the names of the players
	public String playerOne, playerTwo;	
	
	// Possible states of the Game:
	//  GAME_OVER_DRAW: The board is full, with no winner, so it's a draw.
	//  GAME_OVER_ONE: Player one won. (4 consecutive pieces for player one)
	//  GAME_OVER_TWO: Player one won. (4 consecutive pieces for player two)
	//  GAME_ACTIVE: Game is still going on, there are still possible moves.
	//  GAME_INACTIVE: Game has not started yet
	public enum State {
		GAME_OVER_DRAW, GAME_OVER_ONE, GAME_OVER_TWO, GAME_ACTIVE, GAME_INACTIVE
	}
	
	// Variable to store the current state of the board
	public State currentState;
	
	public static int PLAYER_ONE_INT = 1, PLAYER_TWO_INT = 2;
	
	private Board board;
	
	private int currentPlayer;

	// Create the game, set players names and board, and set the game state to GAME_INACTIVE
	public Game() {
		this.playerOne = "Player One";
		this.playerTwo = "Player Two";
		
		currentState = State.GAME_INACTIVE;
		board = new Board();
	}
	
	// STUDENT-TODO
	// Start the game by setting the state to GAME_ACTIVE
	// And set the currentPlayer to either player one or two
	public void startGame() {
		board.clearBoard();
		currentState = State.GAME_ACTIVE;
		currentPlayer = PLAYER_ONE_INT;
	}
	
	// STUDENT-TODO
	// Make the next move for the currentPlayer, and switch the players, by changing currentPlayer
	// HINT: You may call makeMove(int col, int player) from below in this method
	public void makeNextMove(int col) throws InvalidMoveException, GameNotActiveException, NotValidPlayerException, InvalidColumnException {
		makeMove(col, currentPlayer);
		currentPlayer = currentPlayer == PLAYER_ONE_INT? PLAYER_TWO_INT : PLAYER_ONE_INT;
	}
	
	// STUDENT-Partial-TODO?
	// Attempt to add a piece for the given player in the given column
	// Throw exceptions if the column is invalid, or if the column is full, or if the game hasnt started yet 
	private void makeMove(int col, int player) throws InvalidMoveException, GameNotActiveException, InvalidColumnException {
		if (currentState == State.GAME_ACTIVE) { 
			int row = board.addToColumn(col, player);
			if (row < 0) { 
				throw new InvalidMoveException("The move is invalid, the column is full");					
			} else {
				updateGameStateFromPosition(col, row);
			}
		} else { 
			throw new GameNotActiveException("Game has not started yet, please start the game.");
		}
	}

	// STUDENT-TODO
	// Update the currentState after adding a piece to a position on the board
	// HINT: you may want to use methods from Board
	private void updateGameStateFromPosition(int col, int row) { 
		int winner = board.isGameWonFromPosition(col, row);
		if (winner == PLAYER_ONE_INT) {
			currentState = State.GAME_OVER_ONE;
		} else if (winner == PLAYER_TWO_INT) {
			currentState = State.GAME_OVER_TWO;
		} else if (board.isBoardFull()) {
			currentState = State.GAME_OVER_DRAW;
		}
	}

	
	// STUDENT-TODO
	// Checks the currentState, if it is game over
	// Returns true if the currentState is GAME_OVER_DRAW, GAME_OVER_ONE, or GAME_OVER_TWO
	public boolean checkIsGameOver() {
		return (currentState == State.GAME_OVER_DRAW || 
				currentState == State.GAME_OVER_ONE  || 
				currentState == State.GAME_OVER_TWO);
	}
	
	// Public getters
	public State getCurrentGameState() {
		return currentState;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public int getPlayerOneInt(){
		return PLAYER_ONE_INT;
	}
	
	public int getPlayerTwoInt(){
		return PLAYER_TWO_INT;
	}
	
	public int[][] getBoardArray() {
		return board.getBoardArray();
	}
	
	public int getCurrentPlayer(){
		return currentPlayer;
	}
	
	public void drawBoard(){ 
		board.drawBoard(PLAYER_ONE_INT, PLAYER_TWO_INT);
	}
	
	private void showGameOver() {
		System.out.println("GAME OVER");
		switch (currentState) {
		default:
		case GAME_OVER_DRAW:
			System.out.println("DRAW");
			break;
		case GAME_OVER_ONE:
			System.out.println("PLAYER ONE WINS");
			break;
		case GAME_OVER_TWO:
			System.out.println("PLAYER TWO WINS");
			break;
		}
	}
	
	
	// Main method that launches the game through the command line
	public static void main(String[] args) {
		// Start the game and draw the board on the console
		Game game = new Game();
		game.startGame();
		game.drawBoard();
		
		Scanner reader = new Scanner(System.in);
		int playerMove;
		
		// Continue and switch players after every move, while the game isn't over yet
		while (!game.checkIsGameOver()) {
			String playerStr = (game.currentPlayer == PLAYER_ONE_INT) ? game.playerOne : game.playerTwo;
			System.out.println(playerStr + "'s turn to move. Enter a column number between 0 and 6");

			if (reader.hasNextInt()) {
				playerMove = reader.nextInt();
				try {
					game.makeNextMove(playerMove);
					game.drawBoard();
				} catch (InvalidMoveException e) {
					System.out.println(e.getMessage());
				} catch (GameNotActiveException e) {
					System.out.println(e.getMessage());
				} catch (NotValidPlayerException e) {
					System.out.println(e.getMessage());
				} catch (InvalidColumnException e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("Please enter a valid number");
				reader.next();
			}
		}
		
		game.showGameOver();
		reader.close();
	}
}
