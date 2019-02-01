package beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int qid;
	private String question;
	private Map<Answer,User> answers;
	
	public Question(int qid, String question, Map<Answer, User> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	
	public void printQuestion() {
		System.out.println("Question id: "+qid);
		System.out.println("Question: "+question);
		Set<Entry<Answer,User>> answerSet = answers.entrySet();
		Iterator<Entry<Answer,User>> iterator = answerSet.iterator();
		while(iterator.hasNext()) {
			Entry<Answer,User> entry = iterator.next();
			Answer answer = entry.getKey();
			User user = entry.getValue();
			System.out.println(answer);
			System.out.println(user);
		}
	}
	
}
