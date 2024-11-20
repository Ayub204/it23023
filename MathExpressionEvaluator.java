import java.io.*;
import java.util.Scanner;

public class MathExpressionEvaluator {
    public static void main(String[] args) {
        System.out.println("Hi Ayoive your Game is ready ");
        String inputFile = "input.txt";  // Input file with math expressions
        String outputFile = "score.txt"; // Output file for storing score
        int score = 0;  // Initialize score
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Read all expressions from the input file
            String line = reader.readLine();
            if (line == null) {
                System.out.println("Input file is empty!");
                return;
            }

            String[] expressions = line.split(",");
            Scanner scanner = new Scanner(System.in);

            // Process each expression
            for (String expr : expressions) {
                expr = expr.trim(); // Remove unnecessary spaces
                if (expr.length() < 3) {
                    System.out.println("Invalid expression: " + expr);
                    continue;
                }

                // Parse the math expression (e.g., "2+3")
                char operator = expr.charAt(1);
                int operand1 = Character.getNumericValue(expr.charAt(0));
                int operand2 = Character.getNumericValue(expr.charAt(2));
                int correctResult = 0;

                // Calculate the result
                switch (operator) {
                    case '+': correctResult = operand1 + operand2; break;
                    case '-': correctResult = operand1 - operand2; break;
                    case '*': correctResult = operand1 * operand2; break;
                    case '/': 
                        if (operand2 != 0) 
                            correctResult = operand1 / operand2; 
                        else {
                            System.out.println("Division by zero in expression: " + expr);
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator in expression: " + expr);
                        continue;
                }

                // Ask the user for their answer
                System.out.print("What is the result of " + expr + "? ");
                int userAnswer = scanner.nextInt();

                // Compare and update score
                if (userAnswer == correctResult) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct result is: " + correctResult);
                }
            }

            scanner.close();

            // Write the final score to the output file
            writer.write("Final Score: " + score);
            System.out.println("Score details written to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
        }
    }
}
