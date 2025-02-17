package com.wipro.java.usecase3;

import java.util.Scanner;

public class TicTacToe {
	// Declare the game board as an array of 9 positions
	static char[] board = new char[9];
	static char currentPlayer = 'O'; // Player 'X' starts first

	// Step 1: Initialize the board (fill it with empty spaces)
	public static void initializeBoard() {
		for (int i = 0; i < 9; i++) {
			board[i] = ' '; // Initializing each position as empty (' ')
		}
	}

	// Step 2: Print the current state of the board
	public static void printBoard() {
		System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---+---+---");
		System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---+---+---");
		System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
	}

	// Step 3: Take player input to place X or O on the board
	public static void playerMove() {
		Scanner scanner = new Scanner(System.in);
		int position;
		while (true) {
			System.out.println("Player " + currentPlayer + "'s turn. Enter position (1-9): ");
			position = scanner.nextInt() - 1; // Convert 1-9 to 0-8 index

			// Validate the input (position should be within the valid range and empty)
			if (position >= 0 && position < 9 && board[position] == ' ') {
				board[position] = currentPlayer; // Mark the position with X or O
				break; // Exit the loop once a valid move is made
			} else {
				System.out.println("Invalid position! Try again.");
			}
			scanner.close();
		}
		
	}

	// Step 4: Check if the current player has won
	public static boolean checkWin() {
		// Check rows (row 1: 0,1,2; row 2: 3,4,5; row 3: 6,7,8)
		for (int i = 0; i < 3; i++) {
			if (board[i * 3] == currentPlayer && board[i * 3 + 1] == currentPlayer && board[i * 3 + 2] == currentPlayer)
				return true; // Row win
			if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer)
				return true; // Column win
		}
		// Check diagonals
		if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer)
			return true; // Main diagonal win
		if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer)
			return true; // Anti-diagonal win

		return false; // No win found
	}

	// Step 5: Check if the board is full (draw condition)
	public static boolean isBoardFull() {
		for (int i = 0; i < 9; i++) {
			if (board[i] == ' ') {
				return false; // Empty position found
			}
		}
		return true; // No empty positions, it's a draw
	}

	// Step 6: Switch turns between players
	public static void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch player (X <-> O)
	}

	// Main method: Game loop
	public static void main(String[] args) {
		initializeBoard(); // Initialize the board
		printBoard(); // Print the initial empty board

		// Step 7: Game loop (continue until a player wins or it's a draw)
		while (true) {
			playerMove(); // Current player makes a move
			printBoard(); // Display the board after the move

			// Check if the current player has won
			if (checkWin()) {
				System.out.println("Player " + currentPlayer + " wins!");
				break; // Exit the game loop
			}

			// Check if the board is full (draw condition)
			if (isBoardFull()) {
				System.out.println("It's a draw!");
				break; // Exit the game loop
			}

			switchPlayer(); // Switch to the next player
		}
	}
	

}
