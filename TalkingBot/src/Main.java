import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		// create the bot
		String exitStatement = "Done!";
		String defaultAnswer = "Hmmmmm.";
		BlabberBot javaBot = new BlabberBot(exitStatement, defaultAnswer);
		// add some questions
		javaBot.addQuestion("What do you do in life?");
		javaBot.addQuestion("What subject do you like the most?");
		javaBot.addQuestion("Who is your favorite person in your life?");
		// add some keywords and answers
		// note that the current implementation allows for one answer/keyword
		// adding further answers will replace the old one
		javaBot.addAnswer("student", "You need to study hard.");
		javaBot.addAnswer("student", "Contemplating on the nature of things is good.");
		javaBot.addAnswer("java", "Just like me.");
		javaBot.addAnswer("java", "The best language in the world.");
		javaBot.addAnswer("java", "I like coffee too.");
		javaBot.addAnswer("safadi", "No comment.");
		javaBot.addAnswer("safadi", ":-)");
		javaBot.addAnswer("safadi", ":-(");
		javaBot.addAnswer("safadi", ":-O");
		// run the chat session
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			String question = javaBot.nextQuestion();
			System.out.println(question);
			String response = keyboard.nextLine();
			String answer = javaBot.answer(response);
			if (javaBot.hasMoreQuestions()) {
				System.out.print(answer + " ");
			} else {
				return;
			}
		}

	}

}
