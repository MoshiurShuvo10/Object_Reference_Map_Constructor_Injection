package beans;

public class User {
	
	private int user_id;
	String user_name,user_email;

	public User(int user_id, String user_name, String user_email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
	}
	
	@Override
	public String toString() {
		return "user id: "+user_id+"\nuser name: "+user_name+"\nuser email: "+user_email ; 
	}
}
