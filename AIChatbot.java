//Artificial intelligence chatbot
import java.util.Scanner;
public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            // Exit condition
            if (userInput.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day 😊");
                break;
            }

            // Rule-based responses
            else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (userInput.contains("your name")) {
                System.out.println("Bot: I am a Java AI Chatbot.");
            }

            else if (userInput.contains("how are you")) {
                System.out.println("Bot: I am fine. Thanks for asking!");
            }

            else if (userInput.contains("course")) {
                System.out.println("Bot: We provide Java, Python and Web Development courses.");
            }

            else if (userInput.contains("internship")) {
                System.out.println("Bot: CodeAlpha offers amazing internship opportunities.");
            }

            else if (userInput.contains("time")) {
                System.out.println("Bot: Sorry, I cannot check live time now.");
            }

            else if (userInput.contains("thank")) {
                System.out.println("Bot: You're welcome!");
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}