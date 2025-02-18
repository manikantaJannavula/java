package com.wipro.java.usecase;

public class PlayerScores {
	private String name;
	private int score;
	private int totalQuestions;

	// Constructor
	public PlayerScores(String name, int score, int totalQuestions) {
		this.name = name;
		this.score = score;
		this.totalQuestions = totalQuestions;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
}
