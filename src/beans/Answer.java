package beans;

public class Answer {
	private int answer_id;
	private String answer;
	private String date;
	
	public Answer(int answer_id, String answer, String date) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "answer id: "+answer_id+"\nanswer: "+answer+"\nDate: "+date ; 
	}
}
