package api;

public class Board {
	String subject;
	String content;
	String Writer;
	String date;
	
	public Board(String subject,String content,String Writer,String date) {
		this.subject = subject;
		this.content = content;
		this.Writer = Writer; 
		this.date = date;
	}
}
