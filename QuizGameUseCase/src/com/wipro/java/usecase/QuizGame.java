package com.wipro.java.usecase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/QuizGame"; // Updated to handle automatic database creation
        String username = "root";  // Your MySQL username
        String password = "test";  // Your MySQL password

        try {
            // Establishing connection to the database
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database!");

            // Create a scanner object for user input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine(); // Get player's name

            // List of Java programming-related trivia questions
            String[] questions = {
                "What is the default value of a boolean variable in Java?",
                "Which keyword is used to define a constant in Java?",
                "Which method is used to start a thread in Java?",
                "Which package is automatically imported in every Java program?",
                "What is the size of a `long` data type in Java?"
            };

            // Options for each question
            String[][] options = {
                {"1) true", "2) false", "3) null", "4) undefined"},
                {"1) final", "2) constant", "3) static", "4) const"},
                {"1) start()", "2) run()", "3) execute()", "4) begin()"},
                {"1) java.util", "2) java.lang", "3) java.io", "4) java.net"},
                {"1) 4 bytes", "2) 8 bytes", "3) 16 bytes", "4) 32 bytes"}
            };

            // Array of correct answers (indexed from 1, so adjust accordingly for validation)
            int[] correctAnswers = {2, 1, 1, 2, 2}; // Correct answers for each question (index-based)
            int score = 0; // Initialize the score counter

            // Loop through each question in the quiz
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);  // Display question
                
                // Display available options for each question
                for (String option : options[i]) {
                    System.out.println(option);
                }
                
                System.out.print("Your answer (1-4): ");
                int answer = sc.nextInt();  // Read user input
                
                // Check if the user's answer is correct
                if (answer == correctAnswers[i]) {
                    score++;  // Increment score if the answer is correct
                    System.out.println("Correct!\n");
                } else {
                    // Provide feedback if the answer is wrong
                    System.out.println("Wrong! The correct answer was: " + options[i][correctAnswers[i] - 1] + "\n");
                }

               
            }
            // Save the player's score into the database after each question
            String sql = "INSERT INTO PlayerScores (name, score, total_questions) VALUES (?, ?, ?)";
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1, name);  // Set player's name
                statement.setInt(2, score);  // Set the current score
                statement.setInt(3, questions.length);  // Set total number of questions
                int rowsInserted = statement.executeUpdate();  // Execute insert query
                if (rowsInserted > 0) {
                    System.out.println("Your score has been saved successfully!\n");
                }
            } catch (SQLException e) {
                // Handle SQL exception if there's an error during database interaction
                e.printStackTrace();
            }

            // Final score display after all questions are answered
            System.out.println("Your final score is: " + score + " out of " + questions.length);
            sc.close();  // Close the scanner to avoid resource leaks

        } catch (SQLException e) {
            // Handle any SQL exceptions that might occur during database connection or interaction
            e.printStackTrace();
        }
    }
}
