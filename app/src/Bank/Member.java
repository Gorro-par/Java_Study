package Bank;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int balance;
	
	public Member(String name, String id, String pw, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
