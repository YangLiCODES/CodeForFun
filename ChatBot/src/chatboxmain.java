import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class chatboxmain {
	public static void main(String[] args) throws IOException {

		//1 create the chat bot
		String exitStatement = "Done!";
		String defaultAnswer = "Hmmmmm.";
		chatbot javaBot = new chatbot(exitStatement, defaultAnswer);
		
		//2 read the question file and add the questions to the chat bot
		Scanner questionFile = new Scanner(new File("questions.txt"));
		while(questionFile.hasNextLine()) {
			String line = questionFile.nextLine();
			javaBot.addQuestion(line);
		}
		
		//3 read the answer file and add the keywords and answers to the bot
		Scanner answerFile = new Scanner(new File("answers.txt"));
		while(answerFile.hasNextLine()) {			
			String line = answerFile.nextLine();
			String[] fields = line.split(",");
			String keyword = fields[0];
			String answer = fields[1];
			javaBot.addAnswer(keyword, answer);
		}
		
		//4 run the chat session
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			String question = javaBot.nextQuestion();
			System.out.println(question);
			String response = keyboard.nextLine();
			String answer = javaBot.answer(response);
			if(javaBot.hasMoreQuestions()) {
				System.out.print(answer + " ");
			} else {
				return;
			}
		}
	}
}
