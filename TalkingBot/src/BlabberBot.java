import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Random;
public class BlabberBot {
	private String exitStatement;
	private String defaultAnswer;
	private boolean done;
	private ArrayList<String> questions;
	
	
	//edit this attribute to allow multiple answers per keyword
	private HashMap<String, ArrayList<String>> answers;
	

	private Random rand;
	
	public BlabberBot(String exitStatement, String defaultAnswer) {
		this.exitStatement = exitStatement;
		this.defaultAnswer = defaultAnswer;
		done = false;
		questions = new ArrayList<String>();
		answers = new HashMap<String, ArrayList<String>>();
		rand = new Random();
	}

	public int getNumberOfQuestions() {
		return questions.size();
	}
	
	public int getNumberOfAnswers() {
		return answers.keySet().size();
	}
	public void addQuestion(String line) {
		questions.add(line.trim());
		
	}
	
	// edit this method so multiple answers can be associated with one keyword
	public void addAnswer(String keyword, String answer) {
            if(!answers.containsKey(keyword)){
            	answers.put(keyword, new ArrayList<String>());
            }
			answers.get(keyword).add(answer);	
		
		
	}

	public boolean hasMoreQuestions() {
		return !done;
	}

	public String nextQuestion() {
		int i = rand.nextInt(questions.size());
		return questions.get(i);
	}

	//edit this method so you get different answers randomly when response contains same keyword
	public String answer(String response) {
		if(response.trim().equals(exitStatement)) {
			done = true;
		}
		for(String k : answers.keySet()) {
			if(response.toLowerCase().contains(k.toLowerCase())) {
				return answers.get(k).get(rand.nextInt(answers.get(k).size()));
			}
		}
		return defaultAnswer;
	}

}
