import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'exit' to quit.");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            } else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            } else if (input.contains("name")) {
                System.out.println("Bot: I am CodeAlpha AI Chatbot.");
            } else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            } else if (input.contains("internship")) {
                System.out.println("Bot: Internships help gain practical experience.");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great. Thank you!");
            } else if (input.contains("bye")) {
                System.out.println("Bot: Have a nice day!");
            } else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}